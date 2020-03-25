package com.bus.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.bus.dao.UserDao;
import com.bus.hbm.Users;

@Controller
public class UserAuthentication {

	@Autowired
	private UserDao userDao;

	@RequestMapping("/logins")
	public String LoginPage() {
		return "index";
	}
	
	@RequestMapping("/createAcccount")
	public String redirectCreateAccount() {
		return "createacc";
	}
	
	@RequestMapping("/login")
	public String checkLoginPage(@RequestParam("username") String username, @RequestParam("fname") String fname) {
		boolean isValid = userDao.findUser(username, fname);
		if(isValid==true) {
			return "home";
		}else {
			return "index";
		}
	}

	@RequestMapping("create")
	public String registrationCreatePage(Model theModel) {
		theModel.addAttribute("user", new Users());
		userDao.saveUser(theModel);
		return "index";
	}
}
