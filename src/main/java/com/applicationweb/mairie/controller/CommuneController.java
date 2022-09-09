package com.applicationweb.mairie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.applicationweb.mairie.model.Commune;
import com.applicationweb.mairie.service.CommuneService;

@Controller
@RequestMapping("commune")
public class CommuneController {
	
	@Autowired
	private CommuneService communeService;
	
	@PostMapping("/save")
	public Commune savecommune(@RequestBody Commune commune) {
		communeService.savecommune(commune);
		return communeService.savecommune(commune);
		
	}
	
	@GetMapping("/deletecom/{id}")
	public String deleteCommune(@PathVariable(value = "id") Long id) {
		this.communeService.deleteCommuneById(id);
		return "redirect:/";
	}
	
	@GetMapping("/listcom")
	public List<Commune> getAllcommune(){
		return communeService.getAllCommune();
	}

}
