package com.applicationweb.mairie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.applicationweb.mairie.model.Act;
import com.applicationweb.mairie.service.ActService;

@Controller
public class ActController {
	
	@Autowired
	private ActService actService;
	
	@PostMapping("/saves")
	public String saveAct(@ModelAttribute("act") Act act) {
		actService.saveAct(act);
		return "redirect:/";
	}

}
