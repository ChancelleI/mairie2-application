package com.applicationweb.mairie.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SecurityController {
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}

}
