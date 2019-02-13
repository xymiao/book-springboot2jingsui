package com.jkyuntu.springboot2.service;

import com.jkyuntu.springboot2.pojo.User;

public interface HomeService {
	/**
	 * 根据主键查询对应的用户信息
	 * @param id  主键
	 * @return 返回用户信息
	 */
	User getUser(Integer id);
	
}
