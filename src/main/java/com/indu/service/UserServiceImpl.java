package com.indu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indu.dao.UserDao;
import com.indu.model.Login;
import com.indu.model.User;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	public UserDao userDao;
	
	public void register(User user) {
		userDao.register(user);
		
	}

	public User validateUser(Login login) {
		
		return userDao.validateUser(login);
	}

}
