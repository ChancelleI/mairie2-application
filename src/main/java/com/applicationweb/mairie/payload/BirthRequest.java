package com.applicationweb.mairie.payload;

import com.applicationweb.mairie.model.Declaration;
import com.applicationweb.mairie.model.Person;

public class BirthRequest {

	private Long idCommune;

	private String nom_enfant;
	private String dateNaissEnfant;
	private String lieuNaissEnfant;
	private String sexeEnfant;
	private String numActeMariage;
	private String nomAssistant;

	private Person mere;

	private Person pere;

	private String nomDeclarant;
	private String dateFabriqueACte;

	private Declaration declaration;

	public Long getIdCommune() {
		return idCommune;
	}

	public void setIdCommune(Long idCommune) {
		this.idCommune = idCommune;
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

	public String getNumActeMariage() {
		return numActeMariage;
	}

	public void setNumActeMariage(String numActeMariage) {
		this.numActeMariage = numActeMariage;
	}

	public String getNomAssistant() {
		return nomAssistant;
	}

	public void setNomAssistant(String nomAssistant) {
		this.nomAssistant = nomAssistant;
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

}
