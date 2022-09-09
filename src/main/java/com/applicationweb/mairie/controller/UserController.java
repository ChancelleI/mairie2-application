package com.applicationweb.mairie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.applicationweb.mairie.model.User;
import com.applicationweb.mairie.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@PostMapping("/saveuser")
	public User SaveUser(@PathVariable Long roleId, @RequestBody User user ) {
		userService.saveuser(user);
		return userService.saveuser(user);
		
	}
	
	@GetMapping("/deleteuser/{id}")
	public String deleteUser(@PathVariable(value = "id") Long id) {
		this.userService.deleteUserById( id);
		return "redirect:/";
		
	}
	
	@GetMapping("/listuser")
	public List<User> getAlluser(){
		return userService.getAllUser();
	}

}
