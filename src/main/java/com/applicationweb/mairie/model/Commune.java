package com.applicationweb.mairie.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;


@Entity  
public class Commune {

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id_commune;
	private String nomCommune;
	
	@OneToOne(cascade = CascadeType.ALL) 
	private Address address;
	
	@OneToMany @JoinColumn(name ="id_Commune") 
	private List<User> users = new ArrayList<>();

	public Long getId_commune() {
		return id_commune;
	}

	public void setId_commune(Long id_commune) {
		this.id_commune = id_commune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public List<User> getUsers() {
		return users;
	}

	public void setUsers(List<User> users) {
		this.users = users;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Commune(String nomCommune, Address address, List<User> users) {
		super();
		this.nomCommune = nomCommune;
		this.address = address;
		this.users = users;
	}

	
	
	


	
	}
		