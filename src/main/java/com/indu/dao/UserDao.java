package com.indu.dao;

import com.indu.model.Login;

import com.indu.model.User;

public interface UserDao {

  void register(User user);

  User validateUser(Login login);

}