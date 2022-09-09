package com.applicationweb.mairie.security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SidebarController {
	@RequestMapping(value="/sidebar")
	public String sidebar() {
		return "sidebar";
	}

}
