package com.ebay.service.item;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ebay.dao.item.ItemDao;
import com.ebay.domain.item.ItemDto;
import com.ebay.domain.item.RecomendPrice;
@Service("itemService")
public class ItemServiceImpl implements ItemService {
  
	@Resource(name="ebayitemdao")
	private ItemDao itemdao;
	
	@Transactional
	public void addItem(List<ItemDto> list) {
     if(list!=null){
    	for(int i=0;i<list.size();i++){
    		itemdao.save(list.get(i));
    	}
     }
	}

	@Override
	public boolean keyWordExis(String keywords) {
	  int  count=itemdao.getcount(keywords);
	  boolean flag=false;
	  if(count!=0){
		  flag=true;
	  }
	  return flag;
	}

	@Override
	public List<ItemDto> getAllByWords(String keywords) {
		return itemdao.getAllByWords(keywords);
	}

	@Override
	public RecomendPrice getRprice(String keywords) {
	
		return itemdao.getRecPrice(keywords);
	}

	
	

}
