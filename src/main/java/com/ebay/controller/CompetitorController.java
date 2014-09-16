package com.ebay.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ebay.domain.feedback.FeedBack;
import com.ebay.domain.item.Item;
import com.ebay.domain.price.Pring;
import com.ebay.domain.seller.DaySellDto;
import com.ebay.domain.seller.RecentFeedbackratings;
import com.ebay.domain.seller.Seller;
import com.ebay.domain.seller.SellerDto;
import com.ebay.domain.seller.SellerImpl;
import com.ebay.domain.seller.SellerInfoDto;
import com.ebay.domain.seller.WeekSellInfo;
import com.ebay.service.feedback.FeedbackService;
import com.ebay.service.seller.SellerService;
import com.ebay.util.feedback.CatchFeedback;
import com.ebay.util.feedback.CatchFeedbackPlus;
import com.ebay.util.feedback.DealFeedback;
import com.ebay.util.feedback.Util;
import com.ebay.util.seller.CatchSellerInfo;
import com.ebay.util.seller.ConvertStruct;

@Controller("competitorcontroller")
public class CompetitorController {

	@Resource(name = "sellerService")
	private SellerService sellervice;
	@Resource(name = "feedbackService")
	private FeedbackService feedbackservice;

	@ResponseBody
	@RequestMapping("/searchCompetitor")
	public Seller selectCompetitor(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		String sellername = request.getParameter("sellerName");
		Boolean flag = sellervice.sellerExits(sellername);
		Seller seller = new SellerImpl();
		if (flag) {
			seller = sellervice.FindSeller(sellername);
		}
		return seller;
	}

	@ResponseBody
	@RequestMapping("/catchCompetitor")
	public String CatchSeller(HttpServletRequest request,
			HttpServletResponse response) {
		String message = "failed";
		String sellername = request.getParameter("sellerName");
		if (sellername != null && sellername != "") {
			CatchSellerInfo catchinfo = new CatchSellerInfo();
			ConvertStruct convert = new ConvertStruct();
			String url = CatchSellerInfo.Combineurl(sellername);
			String selleInfo = catchinfo.preSellerInfo(url);
			if (selleInfo != "") {
				Seller seller = convert.ConvertSeller(selleInfo, sellername);
				sellervice.AddSeller(seller);
				CatchFeedBack(sellername);
				CatchRates(sellername);
				message = "Success";
			}
		}
		return message;
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public boolean CatchFeedBack(String sellername) {
		boolean flag = false;
		Logger log = Logger.getLogger(CatchFeedback.class);
		CatchFeedbackPlus feedback = new CatchFeedbackPlus();
		String url = CatchFeedbackPlus.combineUrl(sellername);
		Map<String, List<String>> map = new HashMap<String, List<String>>();
		Map<String, List> combine = new HashMap<String, List>();
		map = feedback.realInfo(sellername);
		System.out.println(map.get("Attitude").size());
		if (map != null) {
			combine = DealFeedback.StructInfo(map, sellername);
			if (!combine.isEmpty()) {
				List<FeedBack> feedinfo = combine.get("FEEDBACK");
				feedbackservice.AddFeedbacks(feedinfo);
				flag = true;
			}
		}
		return flag;
	}

	public boolean CatchRates(String sellername) {
		boolean flag = false;
		CatchSellerInfo catchinfo = new CatchSellerInfo();
		ConvertStruct convert = new ConvertStruct();
		String url = CatchSellerInfo.Combineurl(sellername);
		String count = catchinfo.preCountInfo(url);
		if (count != null && count != "") {
			RecentFeedbackratings rates = convert.Convert(count, sellername);
			sellervice.AddRates(rates);
			flag = true;
		}
		return flag;
	}

	@ResponseBody
	@RequestMapping("/selectFeedBack")
	public List<FeedBack> selectAllFeedBack(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		List<FeedBack> list = new ArrayList<FeedBack>();
		String sellername = request.getParameter("sellerName");
		if (sellername != null) {
			list = feedbackservice.selectFeedback(sellername);
		}
		return list;
	}

	@ResponseBody
	@RequestMapping("/selectRates")
	public RecentFeedbackratings selectRates(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		RecentFeedbackratings rates = new RecentFeedbackratings();
		String sellername = request.getParameter("sellerName");

		if (!sellervice.ratesExits(sellername)) {
			CatchRates(sellername);
		}
		if (sellername != null) {
			rates = sellervice.selectRate(sellername);
		}
		return rates;
	}

	@ResponseBody
	@RequestMapping("/selectItems")
	public List<Item> selectSpecialItems(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		String sellername = request.getParameter("sellerName");
		return feedbackservice.getSpecial(sellername);
	}

	@ResponseBody
	@RequestMapping("/selectSingleSeller")
	public SellerDto selectDtoSingleSeller(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		String sellername = request.getParameter("sellerName");
		return sellervice.getSellerDto(sellername);

	}

	@ResponseBody
	@RequestMapping("/selectMonthInfo")
	public List<SellerInfoDto> selectMonthInfo(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		String sellername = request.getParameter("sellerName");
		List<SellerInfoDto> list = sellervice.getMonthInfo(sellername);
		List<SellerInfoDto> newlist = new ArrayList<SellerInfoDto>();
		int[] months = new int[list.size()];
		for (int j = 0; j < list.size(); j++) {
			months[j] = list.get(j).getMonths();
		}
		for (int i = 0; i < 12; i++) {
			int res = compareArray(i, months);
			if (res != 13) {
				newlist.add(list.get(res));
			} else {
				SellerInfoDto dto = new SellerInfoDto(sellername, i, 0.00);
				newlist.add(dto);
			}
		}
		return newlist;
	}

	public static int compareArray(int i, int[] a) {
		int result = 13;
		for (int j = 0; j < a.length; j++) {
			if (a[j] == i) {
				result = j;
			}
		}
		return result;
	}

	@ResponseBody
	@RequestMapping("/selectDayInfo")
	public List<DaySellDto> selectDayInfo(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		String sellername = request.getParameter("sellerName");
		String month=request.getParameter("Month");
		List<DaySellDto> list = sellervice.getDayInfo(sellername, Integer.parseInt(month));
		List<DaySellDto> newlist = new ArrayList<DaySellDto>();
		int[] days = new int[list.size()];
		for (int j = 0; j < list.size(); j++) {
			days[j] = list.get(j).getDay();
		}
		int totalday=Util.getDaysByMonth(Integer.parseInt(month));
		for (int i = 0; i < totalday; i++) {
			int res = compareDay(i, days,totalday);
			if (res !=totalday+1 ) {
				newlist.add(list.get(res));
			} else {
				DaySellDto dto = new DaySellDto(sellername, i, 0.00);
				newlist.add(dto);
			}
		}
		return newlist;
	}
	public static int compareDay(int i, int[] a,int totaldays) {
		int result = totaldays+1;
		for (int j = 0; j < a.length; j++) {
			if (a[j] == i) {
				result = j;
			}
		}
		return result;
	}
	@ResponseBody
	@RequestMapping("/selectWeekInfo")
	public List<WeekSellInfo> selectWeekInfo(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		String sellername = request.getParameter("sellerName");
		String month=request.getParameter("Month");
		List<WeekSellInfo> list = sellervice.getWeekInfo(sellername, Integer.parseInt(month));
		List<WeekSellInfo> newlist = new ArrayList<WeekSellInfo>();
		int[] weeks = new int[list.size()];
		for (int j = 0; j < list.size(); j++) {
			weeks[j] = list.get(j).getWeek();
		}
		for (int i = 0; i < 7; i++) {
			int res = compareWeek(i, weeks);
			if (res !=8 ) {
				newlist.add(list.get(res));
			} else {
				WeekSellInfo dto = new WeekSellInfo(sellername, i, 0.00);
				newlist.add(dto);
			}
		}
		return newlist;
	}
	@ResponseBody
	@RequestMapping("/selectPring")
	public List<Pring> getPricing(HttpServletRequest request,
			HttpServletResponse response, Model model){
		String sellername = request.getParameter("sellerName");
		List<Pring> list=new ArrayList<Pring>();
		list=feedbackservice.getResult(sellername);
				return list;
		
	}
	public static int compareWeek(int i, int[] a) {
		int result = 8;
		for (int j = 0; j < a.length; j++) {
			if (a[j] == i) {
				result = j;
			}
		}
		return result;
	}
}
