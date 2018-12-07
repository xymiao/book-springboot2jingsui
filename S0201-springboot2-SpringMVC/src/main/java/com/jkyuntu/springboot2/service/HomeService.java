package com.jkyuntu.springboot2.service;

import com.jkyuntu.springboot2.pojo.Home;

/**
 * 主页的业务接口
 * @author XyMiao
 */
public interface HomeService {
	/**
	 * 根据title 找到对应的首页信息
	 * @param title 标题
	 * @return 找到的首页信息
	 */
	Home getHome(String title);
}
