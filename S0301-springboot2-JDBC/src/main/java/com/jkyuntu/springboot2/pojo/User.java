package com.jkyuntu.springboot2.pojo;

import java.util.Date;

/**
 * 用户实体类
 * @author XyMiao
 */
public class User {
	private int id; //主键
	private String name;  //名称
	private String did;  //权限
	private Date createdate;  //创建时间
	public Date getCreatedate() {
		return createdate;
	}
	public String getDid() {
		return did;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}
	public void setDid(String did) {
		this.did = did;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
}