package com.applicationweb.mairie.model;



import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

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
	
	@ManyToOne(fetch = FetchType.EAGER)
	private Commune commune = new Commune();
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
        name = "users_roles",
        joinColumns = @JoinColumn(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "role_id")
    )
	private Set<Role> roles = new HashSet<>();
	 
    public void addRole(Role role) {
       this.roles.add(role);
	}

	public User(Long id_User, String nom, String prenom, String dateNaissance, String genre, String numeroCni,
			String login, String residence, String telephone, String password, String email, Commune commune,
			Set<Role> roles) {
		super();
		this.id_User = id_User;
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
		this.commune = commune;
		this.roles = roles;
	}

	public User() {
		super();
	}

	public Long getId_User() {
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

	public String getNumeroCni() {
		return numeroCni;
	}

	public void setNumeroCni(String numeroCni) {
		this.numeroCni = numeroCni;
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

	public Commune getCommune() {
		return commune;
	}

	public void setCommune(Commune commune) {
		this.commune = commune;
	}

	public Set<Role> getRoles() {
		return roles;
	}

	public void setRoles(Set<Role> roles) {
		this.roles = roles;
	}
	
}
	
