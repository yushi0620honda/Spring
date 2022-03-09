package com.example.demo.login.domain.repository.jdbc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.login.domain.model.User;

@Repository("UserDaoJdbcImpl4")
public class UserDaoJdbcImpl4 extends UserDaoJdbcImpl {
	
	@Autowired
	private JdbcTemplate jdbc;
	
	@Override
	public List<User> selectMany() {
		String sql = "SELECT * FROM m_user";
		UserResultSetExtractor extractor = new UserResultSetExtractor();
		
		return jdbc.query(sql, extractor);
	}
}