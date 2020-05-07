package com.practice.dao;

import com.practice.api.User;

public interface UserDao {
	
	public int registerUser(User user);

	public String loginUser(User user);
}
