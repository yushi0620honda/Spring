package com.example.demo.login.domain.repository.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;
import com.example.demo.login.domain.model.User;

@Repository("UserDaoJdbcImpl3")
public class UserDaoJdbcImpl3 extends UserDaoJdbcImpl {
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public User selectOne(String userId) {
		String sql = "SELECT * FROM m_user WHERE user_id = ?";
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User> (User.class);
		
		return jdbc.queryForObject(sql, rowMapper, userId);
	}
	
	@Override
	public List<User> selectMany() {
		String sql = "SELECT * FROM m_user";
		RowMapper<User> rowMapper = new BeanPropertyRowMapper<User> (User.class);
		
		return jdbc.query(sql, rowMapper);
	}
}