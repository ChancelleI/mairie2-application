package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.applicationweb.mairie.model.User;
import com.applicationweb.mairie.repository.Userrepository;

@Service
public class UserService_impl implements UserService {
	
	@Autowired
	private Userrepository userRepository;
	
	@Override
	public User saveuser(User user) {
		return this.userRepository.save(user);
	}
	@Override
	public boolean deleteUserById(Long id) {
		this.userRepository.deleteById(id);
		return false;
	}
	
	@Override
	public List<User>getAllUser(){
		return userRepository.findAll();
	}
	
	@Override
	public User getUserByid(Long id) {
		java.util.Optional<User> optional = userRepository.findById(id);
        User user1;
		if (optional.isPresent()) {
            user1 = optional.get();
        } else {
            throw new RuntimeException(" User not found for id :: " + id);
        }
		
		return user1;
	}

}
