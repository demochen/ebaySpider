package com.ebay.service.user;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.ebay.dao.user.UserDao;
import com.ebay.domain.user.User;

@Service("userService")
public class UserServiceImpl implements UserService {

	@Resource(name = "ebayUserDao")
	private UserDao userdao;
    
	
	public boolean selectUsername(String username) {
		boolean flag = false;
		int count = userdao.selectByUsername(username);
		if (count == 0) {
			flag = true;
		}
		return flag;
	}

	public boolean validateUser(User user) {
		boolean flag = false;
		int count = userdao.validateUser(user);
		if (count != 0) {
			flag = true;
		}
		return flag;
	}

	public User adduser(User user) {

		return userdao.save(user);
	}

	public boolean validateEmail(String emailName) {
		boolean flag = false;
		int count = userdao.selectByUsername(emailName);
		if (count != 0) {
			flag = true;
		}
		return flag;
	}

	public String getPassWord(String userName) {
		return userdao.getPassWord(userName);
	}

}
