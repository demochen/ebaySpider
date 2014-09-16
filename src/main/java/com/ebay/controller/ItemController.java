package com.ebay.controller;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.ebay.domain.item.ItemDto;
import com.ebay.domain.item.RecomendPrice;
import com.ebay.find.FindItemsByKeyWords;
import com.ebay.service.item.ItemService;
import com.ebay.services.finding.FindItemsByKeywordsResponse;
import com.ebay.services.finding.SearchItem;

@Controller("itemcontroller")
public class ItemController {

	@Resource(name = "itemService")
	private ItemService itemservice;
    
	@ResponseBody
	@RequestMapping("/searchItems")
	public List<ItemDto> selectItem(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		String keywords = request.getParameter("keyWords");
		boolean flag = itemservice.keyWordExis(keywords);
		List<ItemDto> list=new ArrayList<ItemDto>();
		if (flag) {
          list=itemservice.getAllByWords(keywords);
		} else {
			FindItemsByKeyWords fm = new FindItemsByKeyWords();
			FindItemsByKeywordsResponse res = null;
			try {
				res = fm.FindItemByKeywords(keywords,400, 1);
			} catch (Exception e) {
				if(e.getCause().equals("java.net.UnknownHostException"));
				e.printStackTrace();
			}
			List<SearchItem> items = res.getSearchResult().getItem();
			if(items!=null){
				List<ItemDto> dtos=convertToItem(items,keywords);
				itemservice.addItem(dtos);
				list=itemservice.getAllByWords(keywords);
			}
		}
		return list;

	}

	public static List<ItemDto> convertToItem(List<SearchItem> seitems,String keywords) {
		List<ItemDto> list = new ArrayList<ItemDto>();
		for (SearchItem sitem : seitems) {
			ItemDto item=new ItemDto();
			item.country=sitem.getCountry();
			item.setItemId(sitem.getItemId());
			item.setKeyWords(keywords);
			item.setTitle(sitem.getTitle());
			item.setPrice(sitem.getSellingStatus().getConvertedCurrentPrice().getValue());
			int count=0;
			if(sitem.getSellingStatus().getBidCount()!=null){
				count=sitem.getSellingStatus().getBidCount();
			}
			item.setSellCount(count);
			item.setGalleryURL(sitem.getGalleryURL());
			item.setViewItemURL(sitem.getViewItemURL());
			list.add(item);
		}
		return list;
	}
	
	@ResponseBody
	@RequestMapping("/getRecomendPrices")
     public RecomendPrice selectRprice(HttpServletRequest request,
			HttpServletResponse response, Model model){
		String keywords = request.getParameter("keyWords");
		return itemservice.getRprice(keywords);
	}
}
