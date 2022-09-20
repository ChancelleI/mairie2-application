package com.applicationweb.other.controllers;
//package com.bezkoder.spring.security.login.controllers;
//
//import java.util.List;
//
//import javax.websocket.server.PathParam;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.bezkoder.spring.security.login.models.User;
//import com.bezkoder.spring.security.login.repository.UserRepository;
//
//@CrossOrigin(origins = "*", maxAge = 3600)
//@RestController
//@RequestMapping("/api/users")
//public class UsersController {
//
//	@Autowired
//	UserRepository userRepository;
//	
//	@GetMapping()
//	public List<User> getUsers(){
//		return userRepository.findAll();
//	}
//	
//	@GetMapping("/user-userID")
//	public User getUserById(@PathParam("userID") Long id) {
//		return userRepository.findById(id).get();
//	}
//}
