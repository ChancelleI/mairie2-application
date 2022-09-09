package com.applicationweb.mairie.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity @Table(name="Address")
public class Address {
	
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String ville;
	private String contact;
	private String email;
	private String quartier;
	public Long getId_Address() {
		return id;
	}
	public void setId_Address(Long id) {
		this.id = id;
	}
	public String getVille() {
		return ville;
	}
	public void setVille(String ville) {
		this.ville = ville;
	}
	public String getContact() {
		return contact;
	}
	public void setContact(String contact) {
		this.contact = contact;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQuartier() {
		return quartier;
	}
	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}
	
	public Address() {
		
	}
	public Address(String ville, String contact, String email, String quartier) {
		super();
		this.ville = ville;
		this.contact = contact;
		this.email = email;
		this.quartier = quartier;
	}
	
	
	
	

}
