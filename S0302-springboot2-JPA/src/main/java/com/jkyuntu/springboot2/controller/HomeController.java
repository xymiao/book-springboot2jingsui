package com.jkyuntu.springboot2.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jkyuntu.springboot2.pojo.User;
import com.jkyuntu.springboot2.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	
	@RequestMapping("")
	public String home(Model model) {
		User user = homeService.getUser(7);
		model.addAttribute("user", user);
		return "index";
	}
	
}