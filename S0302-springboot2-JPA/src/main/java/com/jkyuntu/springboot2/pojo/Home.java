package com.jkyuntu.springboot2.pojo;

public class Home {
	private String title;
	private String homeDesc;
	private long times;
	public String getHomeDesc() {
		return homeDesc;
	}
	public long getTimes() {
		return times;
	}
	public String getTitle() {
		return title;
	}
	public void setHomeDesc(String homeDesc) {
		this.homeDesc = homeDesc;
	}
	public void setTimes(long times) {
		this.times = times;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
}
