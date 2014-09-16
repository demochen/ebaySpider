package com.ebay.dao.user;

import com.ebay.domain.user.User;

public interface UserDao {
  
	public int selectByUsername(String username) ;
	
	public int validateUser(User user);
	
	public User save(User user);
	
	public String getPassWord(String userName);
	
}
