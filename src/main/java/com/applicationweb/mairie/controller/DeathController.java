package com.applicationweb.mairie.controller;

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
import com.applicationweb.mairie.model.Death;
import com.applicationweb.mairie.service.CommuneService;
import com.applicationweb.mairie.service.DeathService;
import com.applicationweb.mairie.service.DeclarationService;
import com.applicationweb.mairie.service.PersonService;

@Controller
public class DeathController {

	@Autowired
	private PersonService personService;
	@Autowired
	private DeclarationService declarationService;
	@Autowired
	private CommuneService communeService;
	@Autowired
	private DeathService deathService;

	@RequestMapping(value = "/deces", method = RequestMethod.GET)
	public String death(Model model) {
		List<Death> list = deathService.getAllDeath();
		model.addAttribute("deathList", list);
		
		List<Commune> listC = communeService.getAllCommune();
		model.addAttribute("communeList", listC);

		Death death = new Death(null, null, null, null, null, null, null, null, null);
		model.addAttribute(death);

		return "deces";

	}

	@PostMapping("/saveDeath")
	public String saveDeath(@ModelAttribute("death") Death death) {
		System.out.println("*****");
		Commune c = death.getCommune();
		death.setCommune(c);
		System.out.println(c);
		System.out.println(death);
		communeService.savecommune(c);

		if (death.getMere().getId() == null) {
			death.setMere(personService.saveperson(death.getMere()));
		}
//		Declaration declaration = new Declaration(death.getPere().getNomPers(), Arrays.asList(), death.getPere(), TypeDeclaration.BIRTH);
//		death.setDeclaration(declarationService.savedeclaration(declaration));
//		death.setCommune(null);
//		
		System.out.println(death);
		deathService.savedeath(death);
		return "redirect:/deces";
	}
	
	@GetMapping("/deleteDeath/{id}")
    public String deleteDeath(@PathVariable(value = "id") long id) {

        // call delete employee method 
        this.deathService.deleteDeathById(id);
        return "redirect:/deces";
    }

}
