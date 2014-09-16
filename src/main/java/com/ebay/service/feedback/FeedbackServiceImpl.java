package com.ebay.service.feedback;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ebay.dao.feedback.FeedbackDao;
import com.ebay.domain.feedback.FeedBack;
import com.ebay.domain.item.Item;
import com.ebay.domain.price.PriceDot;
import com.ebay.domain.price.Pring;
import com.ebay.util.kmeans.Kmeans;


@Service("feedbackService")
public class FeedbackServiceImpl implements FeedbackService{

	@Resource(name = "ebayfeedbackdao")
	private FeedbackDao feedbackdao;
	
	@Override
	@Transactional
	public void AddFeedback(FeedBack feedback) {
		feedbackdao.Save(feedback);
		
	}

	@Override
	@Transactional
	public void AddFeedbacks(List<FeedBack> feedbacks) {
		if(feedbacks!=null){
			for(int i=0;i<feedbacks.size();i++){
				feedbackdao.Save(feedbacks.get(i));
			}
		}
		
	}

	@Override
	public List<FeedBack> selectFeedback(String sellername) {
		
		return feedbackdao.fecthFeedback(sellername);
	}

	@Override
	public List<Item> getSpecial(String sellername) {
		List<Item> list=new ArrayList<Item>();
		List<Item> max=feedbackdao.getMaxItems(sellername);
		List<Item>  min=feedbackdao.getMinItems(sellername);
		list.addAll(max);
		list.addAll(min);
		return list;
	}

	@Override
	public List<PriceDot> getDots(String sellername) {
		
		return feedbackdao.getPriceDtos(sellername);
	}

	@Override
	public double[] getTypePrice(String sellername) {
		List<PriceDot> list=getDots(sellername);
		double[] result=new double[2];
		result=Kmeans.dealDots(list);
		return result;
	}

	@Override
	public List<Pring> getResult(String sellername) {
		List<Pring> list=new ArrayList<Pring>();
       double[] array=getTypePrice(sellername);
       double min=array[0];
       double max=array[1];
       double maxprice=feedbackdao.getMaxPrice(sellername);
       if(min>array[1]){
    	   min=array[1];
    	   max=array[0];
       }
      int mincount=feedbackdao.getKmeansMin(sellername, min);
      int betcount=feedbackdao.getKmeansBet(sellername, min, max);
      int maxcount=feedbackdao.getKmenasMax(sellername, max);
      Pring p1=new Pring("0-"+min, mincount);
      Pring p2=new Pring(min+"-"+max,betcount);
      Pring p3=new Pring(max+"-"+maxprice,maxcount);
      list.add(p1);
      list.add(p2);
      list.add(p3);
		return list;
	}

}
