package com.applicationweb.other.models;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Person {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

//	@NotBlank
	private String nomPers;
	private String lieuNaissance;
	private String dateNaissance;
	private String lieuResidence;
	private String profession;
	private String nationalite;
	
//	@NotBlank
	private String sexe;

	@OneToOne(cascade = CascadeType.ALL) // @JoinColumn(name= "id_Address", nullable=false)
	private Address address;

	public Person() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Person( String nomPers, String lieuNaissance, String dateNaissance, String lieuResidence,
			String profession, String nationalite, String sexe, Address address) {
		super();
		this.nomPers = nomPers;
		this.lieuNaissance = lieuNaissance;
		this.dateNaissance = dateNaissance;
		this.lieuResidence = lieuResidence;
		this.profession = profession;
		this.nationalite = nationalite;
		this.sexe = sexe;
		this.address = address;
	}

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

	public String getLieuNaissance() {
		return lieuNaissance;
	}

	public void setLieuNaissance(String lieuNaissance) {
		this.lieuNaissance = lieuNaissance;
	}

	public String getDateNaissance() {
		return dateNaissance;
	}

	public void setDateNaissance(String dateNaissance) {
		this.dateNaissance = dateNaissance;
	}

	public String getLieuResidence() {
		return lieuResidence;
	}

	public void setLieuResidence(String lieuResidence) {
		this.lieuResidence = lieuResidence;
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

	public String getSexe() {
		return sexe;
	}

	public void setSexe(String sexe) {
		this.sexe = sexe;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Person [id=" + id + ", nomPers=" + nomPers + ", lieuNaissance=" + lieuNaissance + ", dateNaissance="
				+ dateNaissance + ", lieuResidence=" + lieuResidence + ", profession=" + profession + ", nationalite="
				+ nationalite + ", sexe=" + sexe + ", address=" + address + "]";
	}

}
