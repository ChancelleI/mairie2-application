package com.applicationweb.mairie.model;




import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.applicationweb.mairie.TypeActe;




@Entity
@Table(name="BIRTH")
@DiscriminatorValue("BIRTH")
public class Birth extends Act {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String nom_enfant;
	private String dateNaissEnfant;
	private String lieuNaissEnfant;
	private String sexeEnfant;
	
	//@OneToOne @JoinColumn(name="id_Birth")
	//private List<Person>persons = new ArrayList<>();
	
	@OneToOne(cascade=CascadeType.ALL)
	private Person mere;
	
	@OneToOne(cascade=CascadeType.ALL)
	private Person pere;
	
	private String nomDeclarant;
	private String dateFabriqueACte;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Declaration declaration;
	
	public Long getId_Birth() {
		return id;
	}
	public void setId_Birth(Long id) {
		this.id = id;
	}
	public String getNom_enfant() {
		return nom_enfant;
	}
	public void setNom_enfant(String nom_enfant) {
		this.nom_enfant = nom_enfant;
	}
	public String getDateNaissEnfant() {
		return dateNaissEnfant;
	}
	public void setDateNaissEnfant(String dateNaissEnfant) {
		this.dateNaissEnfant = dateNaissEnfant;
	}
	public String getLieuNaissEnfant() {
		return lieuNaissEnfant;
	}
	public void setLieuNaissEnfant(String lieuNaissEnfant) {
		this.lieuNaissEnfant = lieuNaissEnfant;
	}
	public String getSexeEnfant() {
		return sexeEnfant;
	}
	public void setSexeEnfant(String sexeEnfant) {
		this.sexeEnfant = sexeEnfant;
	}
	public Person getMere() {
		return mere;
	}
	public void setMere(Person mere) {
		this.mere = mere;
	}
	public Person getPere() {
		return pere;
	}
	public void setPere(Person pere) {
		this.pere = pere;
	}
	public String getNomDeclarant() {
		return nomDeclarant;
	}
	public void setNomDeclarant(String nomDeclarant) {
		this.nomDeclarant = nomDeclarant;
	}
	public String getDateFabriqueACte() {
		return dateFabriqueACte;
	}
	public void setDateFabriqueACte(String dateFabriqueACte) {
		this.dateFabriqueACte = dateFabriqueACte;
	}
	
	
	public Declaration getDeclaration() {
		return declaration;
	}
	public void setDeclaration(Declaration declaration) {
		this.declaration = declaration;
	}
	public Birth(TypeActe typeActe, Commune commune, String nom_enfant, String dateNaissEnfant, String lieuNaissEnfant,
			String sexeEnfant, Person mere, Person pere, String nomDeclarant, String dateFabriqueACte,
			Declaration declaration) {
		super(typeActe, commune);
		this.nom_enfant = nom_enfant;
		this.dateNaissEnfant = dateNaissEnfant;
		this.lieuNaissEnfant = lieuNaissEnfant;
		this.sexeEnfant = sexeEnfant;
		this.mere = mere;
		this.pere = pere;
		this.nomDeclarant = nomDeclarant;
		this.dateFabriqueACte = dateFabriqueACte;
		this.declaration = declaration;
	}
	
	
	
	
	
	
	
	
}
	
	
	
