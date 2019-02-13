package com.jkyuntu.springboot2.dao;

import org.springframework.data.repository.CrudRepository;

import com.jkyuntu.springboot2.pojo.User;

public interface HomeDao extends CrudRepository<User, Integer> {
	
}	
