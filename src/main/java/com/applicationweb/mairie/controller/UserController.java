package com.applicationweb.mairie.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.applicationweb.mairie.model.Commune;
import com.applicationweb.mairie.model.Role;
import com.applicationweb.mairie.model.User;
import com.applicationweb.mairie.service.CommuneService;
import com.applicationweb.mairie.service.RoleService;
import com.applicationweb.mairie.service.UserService;

@Controller
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private RoleService roleService;
	
	@Autowired
	private CommuneService communeService;
	
	@RequestMapping(value="/admin", method = RequestMethod.GET)
	public String user(Model model) {
		List<User> list = userService.getAllUser();
		List<Role> roles = roleService.getAllRole();
		List<Commune> communes = communeService.getAllCommune();

		model.addAttribute("user", new User());
		model.addAttribute("roles", roles);
		model.addAttribute("communes", communes);
		model.addAttribute("userList", list);
				
		return "admin";
	}
	
	@PostMapping("/addUser")
	public String SaveUser(@ModelAttribute("user") User user ) {
		System.out.println(user.toString());
		userService.saveuser(user);
		return "redirect:/admin";
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
