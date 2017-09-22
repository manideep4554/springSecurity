package com.org.springsecurity.users.dao;


import com.org.springsecurity.users.model.User;

public interface UserDao {

	User findByUserName(String username);

}
