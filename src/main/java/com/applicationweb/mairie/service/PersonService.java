package com.applicationweb.mairie.service;

import java.util.List;

import com.applicationweb.mairie.model.Person;



public interface PersonService {
	
	public Person saveperson(Person person);
	boolean deletePersonById(Long id);
	public List<Person>getAllPerson();
	public Person getPersonByid(Long id);

}
