package com.applicationweb.other.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping
public class HelloController {

	@GetMapping("api/hello")
	public String hello() {
		return "hello";
	}
}
