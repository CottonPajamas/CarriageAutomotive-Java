package com.carriageautomotive.service;

import java.util.ArrayList;

import com.carriageautomotive.model.User;

public interface UserService {

	ArrayList<User> findAllUser();

	User findByUserName(String username);
	
	User findUserById(Integer userId);

	User createUser(User user);

	User updateUser(User user);

	void deleteUser(User user);
	
	boolean userAlreadyExists(User user);


	
	
	


}