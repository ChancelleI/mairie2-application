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

import com.applicationweb.mairie.model.Birth;
import com.applicationweb.mairie.model.Commune;
import com.applicationweb.mairie.model.Declaration;
import com.applicationweb.mairie.model.Person;
import com.applicationweb.mairie.service.BirthService;
import com.applicationweb.mairie.service.CommuneService;
import com.applicationweb.mairie.service.DeclarationService;
import com.applicationweb.mairie.service.PersonService;

@Controller
public class BirthController {
	
	@Autowired
	private BirthService birthService;
	@Autowired
	private PersonService personService;
	@Autowired
	private DeclarationService declarationService;
	@Autowired
	private CommuneService communeService;
	
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
		
		List<Commune> listC = communeService.getAllCommune();
		model.addAttribute("communeList", listC);
		
		return "naisance";
	} 
	

	@PostMapping("/saveBirth")
	public String saveBirth(@ModelAttribute("birth") Birth birth) {
		System.out.println("*****");
		Commune c = birth.getCommune();
		birth.setCommune(c);
		System.out.println(birth);
		communeService.savecommune(c);
		
		if(birth.getPere().getId() == null) {
			birth.setPere(personService.saveperson(birth.getPere()));
		}
		if(birth.getMere().getId()==null) {
			birth.setMere(personService.saveperson(birth.getMere()));
		}
//		Declaration declaration = new Declaration(birth.getPere().getNomPers(), Arrays.asList(), birth.getPere(), TypeDeclaration.BIRTH);
//		birth.setDeclaration(declarationService.savedeclaration(declaration));
//		birth.setCommune(null);
//		
		System.out.println(birth);
		birthService.savebirth(birth);
		return "redirect:/naisance";
		
	}
	
	@GetMapping("/deleteBirth/{id}")
    public String deleteBirth(@PathVariable(value = "id") long id) {

        // call delete employee method 
        this.birthService.deleteBirthById(id);
        return "redirect:/naisance";
    }

}
