package com.jkyuntu.springboot2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jkyuntu.springboot2.dao.HomeDao;
import com.jkyuntu.springboot2.pojo.Home;
import com.jkyuntu.springboot2.pojo.User;

@Service
public class HomeServiceImpl  implements HomeService{

	@Autowired
	private HomeDao homeDao;
	@Override
	public Home getHome(String title) {
		return homeDao.getHome(title);
	}
	@Override
	public User getUser(String id) {
		return homeDao.getUser(id);
	}
	@Override
	public List<User> findUsers() {
		return homeDao.findUsers();
	}
	@Override
	public int updateUser(User user) {
		return homeDao.updateUser(user);
	}
	@Override
	public int deleteUser(String id) {
		return homeDao.deleteUser(id);
	}
	@Override
	public int save(User user) {
		return homeDao.save(user);
	}
	@Override
	public int executeTable(String sql) {
		return homeDao.executeTable(sql);
	}

}
