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
public class Person {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String nomPers;
	private String dateNaissance;
	private String profession;
	private String nationalite;
	

	@OneToOne(cascade = CascadeType.ALL) //@JoinColumn(name= "id_Address", nullable=false)
	private Address address;
	
	@OneToMany @JoinColumn(name="id_person")
	private List<Act> acts =new ArrayList<>();
	
//	@OneToMany  @JoinColumn(name="id_person")
//	private List<Declaration> declarations =new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNomPers() {
		return nomPers;
	}
	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getProfession() {
		return profession;
	}
	public void setProfession(String profession) {
		this.profession = profession;
	}
	public String getNationalite() {
		return nationalite;
	}
	public void setNationalite(String nationalite) {
		this.nationalite = nationalite;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public List<Act> getActs() {
		return acts;
	}
	public void setActs(List<Act> acts) {
		this.acts = acts;
	}
//	public List<Declaration> getDeclarations() {
//		return declarations;
//	}
//	public void setDeclarations(List<Declaration> declarations) {
//		this.declarations = declarations;
//	}
	
	public Person(String nomPers, String dateNaissance, String profession, String nationalite, Address address,
			List<Act> acts) {
		super();
		this.nomPers = nomPers;
		this.dateNaissance = dateNaissance;
		this.profession = profession;
		this.nationalite = nationalite;
		this.address = address;
		this.acts = acts;
	}
	
	
	
	
	
	
	
	}
	
