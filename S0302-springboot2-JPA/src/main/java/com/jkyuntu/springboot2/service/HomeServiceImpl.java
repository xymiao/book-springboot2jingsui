package com.jkyuntu.springboot2.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkyuntu.springboot2.dao.HomeDao;
import com.jkyuntu.springboot2.pojo.User;

@Service
public class HomeServiceImpl  implements HomeService{

	@Autowired
	private HomeDao homeDao;

	@Override
	public User getUser(Integer id) {
		return homeDao.findById(id).get();
	}
}
