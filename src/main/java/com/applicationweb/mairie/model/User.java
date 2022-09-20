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
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_User;
	private String nom;
	private String prenom;
	private String dateNaissance;
	private String genre;
	private String numeroCni;
	private String login;
	private String residence;
	private String telephone;
	private String password;
	private String email;
	private String telUrgence;
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
	
	public String getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public String getNummeroCni() {
		return numeroCni;
	}
	public void setNummeroCni(String nummeroCni) {
		this.numeroCni = nummeroCni;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getResidence() {
		return residence;
	}
	public void setResidence(String residence) {
		this.residence = residence;
	}
	public String getTelephone() {
		return telephone;
	}
	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelUrgence() {
		return telUrgence;
	}
	public void setTelUrgence(String telUrgence) {
		this.telUrgence = telUrgence;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
	public User(String nom, String prenom, String dateNaissance, String genre, String numeroCni, String login,
			String residence, String telephone, String password, String email, String telUrgence,
			Collection<Role> roles) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
		this.genre = genre;
		this.numeroCni = numeroCni;
		this.login = login;
		this.residence = residence;
		this.telephone = telephone;
		this.password = password;
		this.email = email;
		this.telUrgence = telUrgence;
		this.roles = roles;
	}
	
	
	
	
	
	
	
	}
	
