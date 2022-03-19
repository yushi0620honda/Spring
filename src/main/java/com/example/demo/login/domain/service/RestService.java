package com.example.demo.login.domain.service;

import java.util.List;
import com.example.demo.login.domain.model.User;

public interface RestService {
	public boolean insert(User user);
	public User selectOne(String userId);
	public List<User> selectMany();
	public boolean update(User user);
	public boolean delete(String userId);
}