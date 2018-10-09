package com.indu.dao;

import org.springframework.beans.factory.annotation.Autowired;

import com.indu.model.Login;
import com.indu.model.User;
import com.indu.mongorepository.UserRepository;

public class UserDaoImpl implements UserDao {

	@Autowired
	private UserRepository repository;

	public void register(User user) {

		repository.insert(user);
	}

	public User validateUser(Login login) {

		User user = repository.getUserByFirstName(login.getUsername(), login.getPassword());
		return user;

	}

}