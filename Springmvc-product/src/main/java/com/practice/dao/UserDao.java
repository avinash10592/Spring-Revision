package com.practice.dao;

import com.practice.api.Login;
import com.practice.api.User;

public interface UserDao {
	
	void register(User user);

	User validateUser(Login login);
}
