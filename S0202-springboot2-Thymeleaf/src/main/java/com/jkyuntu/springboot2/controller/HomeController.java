package com.jkyuntu.springboot2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jkyuntu.springboot2.pojo.Home;

@Controller
public class HomeController {
	
	@RequestMapping("home")
	public String home(Model model) {
		Home home= new Home();
		home.setTimes(System.currentTimeMillis());
		home.setTitle("我是页面标题");
		home.setHomeDesc("访问首页内容显示完毕");
		model.addAttribute("home", home);
		
		List<String> list = new ArrayList<>();
		for(int i = 0; i <10; i++) {
			list.add(i + "");
		}
		model.addAttribute("list", list);
		
		
		return "index";
	}
	
}