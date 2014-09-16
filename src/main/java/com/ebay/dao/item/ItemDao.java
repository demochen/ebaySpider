package com.ebay.dao.item;

import java.util.List;

import com.ebay.domain.item.ItemDto;
import com.ebay.domain.item.RecomendPrice;

public interface ItemDao {

	public void save(ItemDto dto);
	
	public int getcount(String keywords);

	public List<ItemDto> getAllByWords(String keywords);
	
	
	public RecomendPrice getRecPrice(String keywords);
}
