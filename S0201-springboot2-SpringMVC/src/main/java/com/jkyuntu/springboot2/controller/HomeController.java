package com.jkyuntu.springboot2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.jkyuntu.springboot2.pojo.Home;
import com.jkyuntu.springboot2.service.HomeService;

@Controller
public class HomeController {
	@Autowired
	private HomeService homeService;
	
	@RequestMapping("home")
	public String home(Model model) {
		Home home = homeService.getHome("title");
		model.addAttribute("home", home);
		return "index";
	}
	@RequestMapping(path="homePath")
	public String homePath() {
		return "index";
	}
	
	@RequestMapping(name="homeName", value="homeName")
	public String homeName() {
		return "index";
	}
	
	@RequestMapping(value="homeValue")
	public String homeValue() {
		return "index";
	}
	
	@RequestMapping(value= {"homeValues", "homeValues2"})
	public String homeValues() {
		return "index";
	}
	
	@RequestMapping(value="homeValue2", method=RequestMethod.GET)
	public String homeValue2() {
		return "index";
	}
	
	@RequestMapping(value="homeParam", params= {})
	public String homeParam() {
		return "index";
	}
}
