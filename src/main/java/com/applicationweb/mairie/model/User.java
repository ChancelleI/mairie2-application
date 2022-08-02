package com.applicationweb.mairie.model;



import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;





@Entity
public class User {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id_User;
	private String nom;
	private String prenom;
	
	@ManyToMany(fetch = FetchType.EAGER)
	private Collection<Role> roles = new ArrayList<>();
	
	public Long getIdUser() {
		return id_User;
	}
	public void setId_User(Long id_User) {
		this.id_User = id_User;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	
	public User(String nom, String prenom, Collection<Role> roles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.roles = roles;
	}
	
	
	
	
	
	
	}
	
