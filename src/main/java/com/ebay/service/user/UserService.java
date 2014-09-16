package com.ebay.service.user;

import com.ebay.domain.user.User;

public interface UserService {

	public boolean selectUsername(String username);

	public boolean validateUser(User user);

	public User adduser(User user);
	
	public boolean validateEmail(String emaiName);
	
	public  String getPassWord(String userName);
}
