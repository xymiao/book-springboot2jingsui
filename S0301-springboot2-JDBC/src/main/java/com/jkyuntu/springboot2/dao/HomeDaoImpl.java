package com.jkyuntu.springboot2.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.jkyuntu.springboot2.pojo.Home;
import com.jkyuntu.springboot2.pojo.User;

@Repository
public class HomeDaoImpl implements HomeDao{

	@Autowired
	JdbcTemplate jdbcTemplate;
	
	@Override
	public Home getHome(String title) {
		String sql = "select count(*) from user";
		int rows = jdbcTemplate.queryForObject(sql, Integer.class);
		Home home = new Home();
		home.setTimes(rows);
		home.setTitle("当前共" + home.getTimes());
		return home;
	}

	@Override
	public User getUser(String id) {
		String sql = "select * from user where id = ?";
		User u = jdbcTemplate.queryForObject(sql,new Object[] {id},  new RowMapper<User>() {
			@Override
			public User mapRow(ResultSet rs, int rowNum) throws SQLException {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setName(rs.getString("name"));
				user.setCreatedate(rs.getDate("createdate"));
				user.setDid(rs.getString("did"));
				return user;
			}
		});
		return u;
	}

	/**
	 * 为了方便, 封装出来一个实现方法. 用实体类来存放数据. 
	 * @author XyMiao
	 */
	class UserRowMapper implements RowMapper<User>{
		@Override
		public User mapRow(ResultSet rs, int rowNum) throws SQLException {
			User user = new User();
			user.setId(rs.getInt("id"));
			user.setName(rs.getString("name"));
			user.setCreatedate(rs.getDate("createdate"));
			user.setDid(rs.getString("did"));
			return user;
		}
	}
	
	@Override
	public List<User> findUsers() {
		String sql = "select id, name, createdate, did from user";
		List<User> list = jdbcTemplate.query(sql, new UserRowMapper());
		return list;
	}

	@Override
	public int updateUser(User user) {
		String sql = "update user set name = ? where id = ?";
		return jdbcTemplate.update(sql, user.getName(), user.getId());
	}

	@Override
	public int deleteUser(String id) {
		String sql = "delete from user where id = ?";
		return jdbcTemplate.update(sql, id);
	}

	@Override
	public int save(User user) {
		String sql = "insert into user(name, createdate, did) values(?, ?, ?)";
		return jdbcTemplate.update(sql, user.getName(), user.getCreatedate(), user.getDid());
	}

	@Override
	public int executeTable(String sql) {
		sql = "create table test_test(id int, name varchar(100), primary key(id))";
		 jdbcTemplate.execute(sql);
		return 1;
	}
}
