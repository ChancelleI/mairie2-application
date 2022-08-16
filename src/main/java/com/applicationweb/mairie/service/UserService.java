package com.applicationweb.mairie.service;

import java.util.List;

import com.applicationweb.mairie.model.User;



public interface UserService {
	public User saveuser(User user);
	boolean deleteUserById(Long id);
	public List<User>getAllUser();
	public User getUserByid(Long id);


}
