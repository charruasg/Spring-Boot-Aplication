package com.GF.GestiondeForraje.service;

import javax.validation.Valid;

import com.GF.GestiondeForraje.entity.User;

public interface UserService {
	
	public Iterable<User> getAllUsers();

	public User createUser(User user) throws Exception;
	
	
	
	

}
