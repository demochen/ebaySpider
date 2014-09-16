package com.ebay.service.item;

import java.util.List;

import com.ebay.domain.item.ItemDto;
import com.ebay.domain.item.RecomendPrice;

public interface  ItemService {

	
	public void addItem(List<ItemDto> list);
    
	public boolean keyWordExis(String keywords);
	
	public List<ItemDto> getAllByWords(String keywords);
	
	public RecomendPrice getRprice(String keywords);
	
}
