package com.jkyuntu.springboot2.dao;

import java.util.List;

import com.jkyuntu.springboot2.pojo.Home;
import com.jkyuntu.springboot2.pojo.User;

public interface HomeDao {
	/**
	 * 加载一条数据根据title
	 * @param title 标题
	 * @return 找到对应的数据
	 */
	Home getHome(String title);
	/**
	 * 根据主键查询对应的用户信息
	 * @param id  主键
	 * @return 返回用户信息
	 */
	User getUser(String id);
	
	/**
	 * 查询所有的数据
	 * @return 返回用户的结果集
	 */
	List<User> findUsers();
	
	/**
	 * 根据用户的主键更新对应的数据
	 * @param user  需要更新的User信息
	 * @return 受影响的行数
	 */
	int updateUser(User user);
	
	/**
	 * 根据主键删除对应的数据
	 * @param id  主键
	 * @return 受影响的行数
	 */
	int deleteUser(String id);
	
	/**
	 * 保存用户信息
	 * @param user  用户实体类
	 * @return 受影响的行数
	 */
	int save(User user);
	
	int executeTable(String sql);
}	
