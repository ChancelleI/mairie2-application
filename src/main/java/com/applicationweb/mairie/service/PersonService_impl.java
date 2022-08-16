package com.applicationweb.mairie.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.applicationweb.mairie.model.Person;
import com.applicationweb.mairie.repository.Personrepository;

@Service
public class PersonService_impl implements PersonService  {
	
	@Autowired
	private Personrepository personRepository;
	
	@Override
	public Person saveperson(Person person) {
		return this.personRepository.save(person);
	}
	
	@Override
	public boolean deletePersonById(Long id) {
		this.personRepository.deleteById(id);
		return false;
	}
	
	@Override
	public List<Person>getAllPerson(){
		return personRepository.findAll();
	}
	
	@Override
	public Person getPersonByid(Long id) {
		java.util.Optional<Person> optional = personRepository.findById(id);
        Person person1;
		if (optional.isPresent()) {
            person1 = optional.get();
        } else {
            throw new RuntimeException("Person not found for id :: " + id);
        }
		
		return person1;
	}

}
