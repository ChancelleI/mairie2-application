package com.applicationweb.other.models;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "BIRTH")
@DiscriminatorValue("BIRTH")
public class Birth extends Act {

	@OneToOne
	private Person enfant;

	private String numActeMariage;
	
	private String nomAssistant;

	private String dateFabriqueACte;

	@OneToOne(cascade = CascadeType.ALL)
	private Person mere;

	@OneToOne(cascade = CascadeType.ALL)
	private Person pere;

	@OneToOne(cascade = CascadeType.ALL)
	private Declaration declaration;

	public Birth() {

	}

	public Birth(Person enfant, String numActeMariage, String nomAssistant, String dateFabriqueACte, Person mere,
			Person pere, Declaration declaration) {
		super();
		this.enfant = enfant;
		this.numActeMariage = numActeMariage;
		this.nomAssistant = nomAssistant;
		this.dateFabriqueACte = dateFabriqueACte;
		this.mere = mere;
		this.pere = pere;
		this.declaration = declaration;
	}

	public Birth(Commune commune, TypeActe typeActe, Person enfant, String numActeMariage, String nomAssistant,
			String dateFabriqueACte, Person mere, Person pere, Declaration declaration) {
		super(typeActe, commune);
		this.enfant = enfant;
		this.numActeMariage = numActeMariage;
		this.nomAssistant = nomAssistant;
		this.dateFabriqueACte = dateFabriqueACte;
		this.mere = mere;
		this.pere = pere;
		this.declaration = declaration;
	}

	public Person getEnfant() {
		return enfant;
	}

	public void setEnfant(Person enfant) {
		this.enfant = enfant;
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

	public String getDateFabriqueACte() {
		return dateFabriqueACte;
	}

	public void setDateFabriqueACte(String dateFabriqueACte) {
		this.dateFabriqueACte = dateFabriqueACte;
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

	public Declaration getDeclaration() {
		return declaration;
	}

	public void setDeclaration(Declaration declaration) {
		this.declaration = declaration;
	}
//
//	public String getType_acte() {
//		return type_acte;
//	}
//
//	public void setType_acte(String type_acte) {
//		this.type_acte = type_acte;
//	}

//	@Override
//	public String toString() {
//		return "Birth [enfant=" + enfant + ", type_acte=" + type_acte + ", numActeMariage=" + numActeMariage
//				+ ", nomAssistant=" + nomAssistant + ", dateFabriqueACte=" + dateFabriqueACte + ", mere=" + mere
//				+ ", pere=" + pere + ", declaration=" + declaration + "]";
//	}

	@Override
	public String toString() {
		return "Birth [id=" + id + ", enfant=" + enfant + ", numActeMariage=" + numActeMariage + ", nomAssistant="
				+ nomAssistant + ", dateFabriqueACte=" + dateFabriqueACte + ", mere=" + mere + ", pere=" + pere
				+ ", declaration=" + declaration + "]";
	}

}
