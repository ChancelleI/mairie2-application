package com.applicationweb.mairie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import com.applicationweb.mairie.model.Birth;
import com.applicationweb.mairie.model.Commune;
import com.applicationweb.mairie.model.Declaration;
import com.applicationweb.mairie.model.Person;
import com.applicationweb.mairie.service.BirthService;

@Controller
public class BirthController {
	
	@Autowired
	private BirthService birthService;
	
	@RequestMapping(value="/naisance", method = RequestMethod.GET)
	public String birth(Model model) {
		Person pere=new Person();
		Person mere = new Person();
		Declaration declaration=new Declaration(null, null, mere, null);
		Commune commune=new Commune(null, null, null);
		Birth birth=new Birth(commune);
		birth.setPere(pere);
		birth.setMere(mere);
		birth.setDeclaration(declaration);
		model.addAttribute("birth", birth);
		
		List<Birth> list = birthService.getAllBirth();
		model.addAttribute("birthList", list);
		return "naisance";
	} 
	

	@PostMapping("/saveBirth")
	public String saveBirth(@ModelAttribute("birth") Birth birth) {
		System.out.println(birth);
//		birthService.savebirth(birth);
		return "redirect:/naisance";
		
	}

}
