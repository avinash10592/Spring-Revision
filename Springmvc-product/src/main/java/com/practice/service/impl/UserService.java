package com.practice.service.impl;

import com.practice.api.Login;
import com.practice.api.User;

public interface UserService {
	public void register(User user);

	public User validateUser(Login login);

}
