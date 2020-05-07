package com.practice.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.practice.api.Login;
import com.practice.api.User;
import com.practice.dao.UserDao;

public class UserServiceImpl implements UserService {

	@Autowired
	UserDao userDao;

	@Override
	public void register(User user) {
		userDao.register(user);

	}

	@Override
	public User validateUser(Login login) {

		return userDao.validateUser(login);
	}
}
