package com.applicationweb.other.controllers;
//package com.bezkoder.spring.security.login.controllers;
//
////import javax.validation.Valid;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import com.bezkoder.spring.security.login.payload.request.LoginRequest;
//import com.bezkoder.spring.security.login.payload.request.SignupRequest;
//import com.bezkoder.spring.security.login.service.AuthService;
//
//@CrossOrigin(origins = "*", maxAge = 3600)
//@RestController
//@RequestMapping("/api/auth")
//public class AuthController {
//
//	@Autowired
//	AuthService authService;
//
//	@PostMapping("/signin")
//	public ResponseEntity<?> authenticateUser( @RequestBody LoginRequest loginRequest) {
//		return authService.authenticateUser(loginRequest);
//	}
//
//	@PostMapping("/signup")
//	public ResponseEntity<?> registerUser(@RequestBody SignupRequest signUpRequest) {
//		return authService.registerUser(signUpRequest);
//	}
//
//	@PostMapping("/signout")
//	public ResponseEntity<?> logoutUser() {
//		return authService.logoutUser();
//	}
//}
