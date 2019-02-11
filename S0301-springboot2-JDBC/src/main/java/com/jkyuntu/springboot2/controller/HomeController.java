package com.jkyuntu.springboot2.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jkyuntu.springboot2.pojo.Home;
import com.jkyuntu.springboot2.pojo.User;
import com.jkyuntu.springboot2.service.HomeService;

@Controller
public class HomeController {
	
	@Autowired
	private HomeService homeService;
	@RequestMapping("home")
	public String home(Model model) {
		Home home = homeService.getHome(""); 
		model.addAttribute("home", home);
		
		User u= new User();
		u.setName("auto_data");
		u.setCreatedate(new Date());
		u.setDid("4");
		homeService.save(u);
		
		//请查询数据库中存在的主键是什么, 然后吧主键放到此处
		User user = homeService.getUser("8");  
		model.addAttribute("user", user);
		
		//获得一组数据
		List<User> list = homeService.findUsers();
		model.addAttribute("list", list);
		
		user.setName("update_com");
		homeService.updateUser(user);
		
		homeService.deleteUser(user.getId() + ""); //删除主键为4的数据. 
		
		homeService.executeTable("");
		
		return "index";
	}
	
}