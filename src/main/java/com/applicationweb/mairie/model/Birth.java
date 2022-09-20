package com.applicationweb.mairie.model;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.applicationweb.mairie.TypeActe;

@Entity
@Table(name = "BIRTH")
@DiscriminatorValue("BIRTH")
public class Birth extends Act {

	private String nom_enfant;
	private String dateNaissEnfant;
	private String lieuNaissEnfant;
	private String sexeEnfant;
	private String numActeMariage;
	private String nomAssistant;
//	private String centreEtat;

	// @OneToOne @JoinColumn(name="id_Birth")
	// private List<Person>persons = new ArrayList<>();

	@OneToOne(cascade = CascadeType.ALL)
	private Person mere;

	@OneToOne(cascade = CascadeType.ALL)
	private Person pere;

	private String nomDeclarant;
	private String dateFabriqueACte;

	@OneToOne(cascade = CascadeType.ALL)
	private Declaration declaration;

	public Birth(String nom_enfant, String lieuNaissEnfant) {
		super();
		this.nom_enfant = nom_enfant;
		this.lieuNaissEnfant = lieuNaissEnfant;
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

//	public String getCentreEtat() {
//		return centreEtat;
//	}
//	public void setCentreEtat(String centreEtat) {
//		this.centreEtat = centreEtat;
//	}
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

	public Birth() {
		super();

	}

	public Birth(Commune commune) {
		super(commune);

	}

	public Birth(Commune commune, String nom_enfant, String dateNaissEnfant, String lieuNaissEnfant, String sexeEnfant,
			String numActeMariage, String nomAssistant, String centreEtat, Person mere, Person pere,
			String nomDeclarant, String dateFabriqueACte, Declaration declaration) {
		super(commune);
		this.nom_enfant = nom_enfant;
		this.dateNaissEnfant = dateNaissEnfant;
		this.lieuNaissEnfant = lieuNaissEnfant;
		this.sexeEnfant = sexeEnfant;
		this.numActeMariage = numActeMariage;
		this.nomAssistant = nomAssistant;
//		this.centreEtat = centreEtat;
		this.mere = mere;
		this.pere = pere;
		this.nomDeclarant = nomDeclarant;
		this.dateFabriqueACte = dateFabriqueACte;
		this.declaration = declaration;
	}

	@Override
	public String toString() {
		return "Birth [nom_enfant=" + nom_enfant + ", dateNaissEnfant=" + dateNaissEnfant + ", lieuNaissEnfant="
				+ lieuNaissEnfant + ", sexeEnfant=" + sexeEnfant + ", numActeMariage=" + numActeMariage
				+ ", nomAssistant=" + nomAssistant + ", mere=" + mere + ", pere=" + pere + ", nomDeclarant="
				+ nomDeclarant + ", dateFabriqueACte=" + dateFabriqueACte + ", declaration=" + declaration + "]";
	}

}
