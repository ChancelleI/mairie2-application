package com.applicationweb.other.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.applicationweb.other.enums.ETypeActe;
import com.applicationweb.other.models.Birth;
import com.applicationweb.other.models.Commune;
import com.applicationweb.other.models.Declaration;
import com.applicationweb.other.models.Person;
import com.applicationweb.other.models.TypeActe;
import com.applicationweb.other.payload.request.BirthRequest;
import com.applicationweb.other.repository.BirthRepository;
import com.applicationweb.other.repository.CommuneRepository;
import com.applicationweb.other.repository.DocumentRepository;
import com.applicationweb.other.repository.PersonRepository;
import com.applicationweb.other.repository.TypeActeRepository;
import com.applicationweb.other.repository.TypeDocumentRepository;

@Service
public class BirthService {

	@Autowired
	PersonRepository personRepository;

	@Autowired
	TypeDocumentRepository typeDocumentRepository;

	@Autowired
	DocumentRepository documentRepository;

	@Autowired
	BirthRepository birthRepository;

	@Autowired
	CommuneRepository communeRepository;
	
	@Autowired
	TypeActeRepository typeActeRepository;

	@Autowired
	DeclarationService declarationService;

	public Birth add(@RequestBody BirthRequest c) {

		Person pere = new Person();
		Person mere = new Person();

		// J'enregiste le pere
		if (c.getIdPere() != null)
			pere = personRepository.findById(c.getIdPere()).get();
		else {
			pere = c.getPere();
			personRepository.save(pere);
		}
		System.out.println("Pere : " + pere);

		// J'enregistre la mere
		if (c.getIdMere() != null)
			mere = personRepository.findById(c.getIdMere()).get();
		else {
			mere = c.getMere();
			personRepository.save(mere);
		}
		System.out.println("Mere : " + mere);

		c.getDeclarationRequest().setPersonne(c.getEnfant());

		// j'enregistre la declaration
		Declaration d = declarationService.add(c.getDeclarationRequest());

		// J'enregistre les informations liées à acte : commune et typeActe
		System.out.println("idCommune : " + c.getIdCommune());
		Commune commune = communeRepository.findById(c.getIdCommune()).get();
		System.out.println("Commune : " + c);

		TypeActe t = new TypeActe(ETypeActe.BIRTH);
		typeActeRepository.save(t);
		System.out.println(t);
		

//		Act act = new Act(t, commune);

		Birth b = new Birth(commune, t,c.getEnfant(), c.getNumActeMariage(), c.getNomAssistant(), c.getDateFabriqueACte(), mere,
				pere, d);
		System.out.println(b);
		
		
		return  b;
	}
}
