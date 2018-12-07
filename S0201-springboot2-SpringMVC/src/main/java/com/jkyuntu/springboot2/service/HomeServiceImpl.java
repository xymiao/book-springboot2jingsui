package com.jkyuntu.springboot2.service;

import org.springframework.stereotype.Service;

import com.jkyuntu.springboot2.pojo.Home;

@Service
public class HomeServiceImpl implements HomeService {

	@Override
	public Home getHome(String title) {
		//这里为了演示, 就不在向dao获取数据. 等到后续操作数据库之后, 在做演示. 
		Home home = new Home();
		home.setTitle(title);
		home.setHomeDesc("当前是描述" + title);
		return home;
	}

}
