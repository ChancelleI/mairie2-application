package com.applicationweb.other.models;
//package com.bezkoder.spring.security.login.models;
//
//import java.util.Date;
//import java.util.HashSet;
//import java.util.Set;
//
//import javax.persistence.Entity;
//import javax.persistence.FetchType;
//import javax.persistence.GeneratedValue;
//import javax.persistence.GenerationType;
//import javax.persistence.Id;
//import javax.persistence.JoinColumn;
//import javax.persistence.JoinTable;
//import javax.persistence.ManyToMany;
//import javax.persistence.Table;
//import javax.persistence.UniqueConstraint;
//import javax.validation.constraints.Email;
//import javax.validation.constraints.NotBlank;
//import javax.validation.constraints.Size;
//
//import org.springframework.format.annotation.DateTimeFormat;
//
//@Entity
//@Table(name = "users", uniqueConstraints = { @UniqueConstraint(columnNames = "username"),
//		@UniqueConstraint(columnNames = "email") })
//public class User {
//	@Id
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
//	private Long id;
//
//	private String nom;
//
//	private String prenom;
//
//	@DateTimeFormat
//	private Date dateNaissance;
//
//	private String genre;
//
//	private String numeroCni;
//
//	private String residence;
//
//	private Long telephone;
//
//	private Long telUrgence;
//
//	@NotBlank
//	@Size(max = 20)
//	private String username;
//
//	@NotBlank
//	@Size(max = 50)
//	@Email
//	private String email;
//
//	@NotBlank
//	@Size(max = 120)
//	private String password;
//
//	@ManyToMany(fetch = FetchType.LAZY)
//	@JoinTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"), inverseJoinColumns = @JoinColumn(name = "role_id"))
//	private Set<Role> roles = new HashSet<>();
//
//	public User() {
//	}
//
//	public User(String username, String email, String password) {
//		this.username = username;
//		this.email = email;
//		this.password = password;
//	}
//
//	public User(String nom, String prenom, Date dateNaissance, String genre, String numeroCni, String residence,
//			Long telephone, Long telUrgence, String username, String email, String password) {
//		super();
//		this.nom = nom;
//		this.prenom = prenom;
//		this.dateNaissance = dateNaissance;
//		this.genre = genre;
//		this.numeroCni = numeroCni;
//		this.residence = residence;
//		this.telephone = telephone;
//		this.telUrgence = telUrgence;
//		this.username = username;
//		this.email = email;
//		this.password = password;
//	}
//
//	public Long getId() {
//		return id;
//	}
//
//	public void setId(Long id) {
//		this.id = id;
//	}
//
//	public String getUsername() {
//		return username;
//	}
//
//	public void setUsername(String username) {
//		this.username = username;
//	}
//
//	public String getEmail() {
//		return email;
//	}
//
//	public void setEmail(String email) {
//		this.email = email;
//	}
//
//	public String getPassword() {
//		return password;
//	}
//
//	public void setPassword(String password) {
//		this.password = password;
//	}
//
//	public Set<Role> getRoles() {
//		return roles;
//	}
//
//	public void setRoles(Set<Role> roles) {
//		this.roles = roles;
//	}
//
//	public String getNom() {
//		return nom;
//	}
//
//	public void setNom(String nom) {
//		this.nom = nom;
//	}
//
//	public String getPrenom() {
//		return prenom;
//	}
//
//	public void setPrenom(String prenom) {
//		this.prenom = prenom;
//	}
//
//	public Date getDateNaissance() {
//		return dateNaissance;
//	}
//
//	public void setDateNaissance(Date dateNaissance) {
//		this.dateNaissance = dateNaissance;
//	}
//
//	public String getGenre() {
//		return genre;
//	}
//
//	public void setGenre(String genre) {
//		this.genre = genre;
//	}
//
//	public String getNumeroCni() {
//		return numeroCni;
//	}
//
//	public void setNumeroCni(String numeroCni) {
//		this.numeroCni = numeroCni;
//	}
//
//	public String getResidence() {
//		return residence;
//	}
//
//	public void setResidence(String residence) {
//		this.residence = residence;
//	}
//
//	public Long getTelephone() {
//		return telephone;
//	}
//
//	public void setTelephone(Long telephone) {
//		this.telephone = telephone;
//	}
//
//	public Long getTelUrgence() {
//		return telUrgence;
//	}
//
//	public void setTelUrgence(Long telUrgence) {
//		this.telUrgence = telUrgence;
//	}
//
//	@Override
//	public String toString() {
//		return "User [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", dateNaissance=" + dateNaissance
//				+ ", genre=" + genre + ", numeroCni=" + numeroCni + ", residence=" + residence + ", telephone="
//				+ telephone + ", telUrgence=" + telUrgence + ", username=" + username + ", email=" + email
//				+ ", password=" + password + ", roles=" + roles + "]";
//	}
//
//}
