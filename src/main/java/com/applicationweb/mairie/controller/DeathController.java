package com.applicationweb.mairie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.applicationweb.mairie.model.Death;
import com.applicationweb.mairie.service.DeathService;

@RestController
public class DeathController {
	
	@Autowired
	private DeathService deathService;
	@PostMapping("/saveDeath")
	public Death saveDeath(@RequestBody Death death) {
		deathService.savedeath(death);
		return deathService.savedeath(death);
	}
	

}
