package com.indu.service;

import com.indu.model.Login;
import com.indu.model.User;

public interface UserService {

	public void register(User user);
	public User validateUser(Login login);
}
