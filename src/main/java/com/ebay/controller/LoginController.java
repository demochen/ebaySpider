package com.ebay.controller;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ebay.domain.user.User;
import com.ebay.form.UserForm;
import com.ebay.service.user.UserService;
import com.ebay.util.mail.SendEmail;

@Controller("loginController")
public class LoginController {

	@Resource(name = "userService")
	private UserService userservice;

	@RequestMapping(value = { "ebay", "/" })
	public String Login(HttpServletRequest request,
			HttpServletResponse response, Model model,
			@ModelAttribute("userForm") UserForm userForm) {
		return  "login/login";
	}

	@RequestMapping("/login/controller")
	public String validateLogin(HttpServletRequest request,
			HttpServletResponse response, Model model,
			@ModelAttribute("userForm") UserForm userForm) {
		String location = "product/product";
		User user = userForm.getUser();
		boolean flag = userservice.validateUser(user);
		if (!flag) {
			Map<String, String> error = new HashMap<String, String>();
			error.put("ERROR", "User's Name or Password Is not Correct");
			model.addAllAttributes(error);
			location = "login/login";
		}
		return  location;
	}

	@RequestMapping("/forgetpassword")
	public String forgetPassword(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		return "forgetpassword/forget";
	}
	@RequestMapping("/competitor/competitor")
	public String category(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		return "competitor/competitor";
	}
	@RequestMapping("/product/product")
	public String product(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		return "product/product";
	}
	@RequestMapping("/sendemail")
	public String getEmail(HttpServletRequest request,
			HttpServletResponse response, Model model) {
		String emailname = (String) request.getParameter("email");
		boolean flag = userservice.validateEmail(emailname);
		if (!flag) {
			Map<String, String> error = new HashMap<String, String>();
			error.put("ERROR", "Email number Not Found");
			model.addAllAttributes(error);
		}else{
			String passWord=userservice.getPassWord(emailname);
			SendEmail.send(emailname, passWord);
			Map<String, String> success = new HashMap<String, String>();
			success.put("SUCCESS", "Email has sended ");
			model.addAllAttributes(success);
			model.addAttribute("emailaddress",emailname);
		}
		
		return "forgetpassword/forget";
	}

}
