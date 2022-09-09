package com.applicationweb.mairie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import com.applicationweb.mairie.model.Person;
import com.applicationweb.mairie.service.PersonService;

@Controller
public class PersonController {
	
	@Autowired
	private PersonService personService;
	
	@PostMapping("/saveperson/address/{addressId}")
	public Person SavePerson(@PathVariable Long addressId, @RequestBody Person person ) {
		personService.saveperson(person);
		return personService.saveperson(person);
		
	}
	
	@GetMapping("/deleteperson/{id}")
	public String deletePerson(@PathVariable(value = "id") Long id) {
		this.personService.deletePersonById( id);
		return "redirect:/";
		
	}
	
	@GetMapping("/listperson")
	public List<Person> getAllperson(){
		return personService.getAllPerson();
	}

}
