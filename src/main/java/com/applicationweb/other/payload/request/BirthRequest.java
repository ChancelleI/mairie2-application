package com.applicationweb.other.payload.request;

import com.applicationweb.other.models.Person;

public class BirthRequest {

	private Long idCommune;

	private Person enfant;

	private String numActeMariage;
	private String nomAssistant;

	private String dateFabriqueACte;

	private Person mere;

	private Long idMere;

	private Person pere;

	private Long idPere;

	private DeclarationRequest declarationRequest;

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

	public Long getIdMere() {
		return idMere;
	}

	public void setIdMere(Long idMere) {
		this.idMere = idMere;
	}

	public Long getIdPere() {
		return idPere;
	}

	public void setIdPere(Long idPere) {
		this.idPere = idPere;
	}

	public DeclarationRequest getDeclarationRequest() {
		return declarationRequest;
	}

	public void setDeclarationRequest(DeclarationRequest declarationRequest) {
		this.declarationRequest = declarationRequest;
	}

	public Long getIdCommune() {
		return idCommune;
	}

	public void setIdCommune(Long idCommune) {
		this.idCommune = idCommune;
	}

	@Override
	public String toString() {
		return "BirthRequest [ enfant=" + enfant + ", numActeMariage=" + numActeMariage + ", nomAssistant="
				+ nomAssistant + ", dateFabriqueACte=" + dateFabriqueACte + ", mere=" + mere + ", pere=" + pere
				+ ", declaration=" + declarationRequest + "]";
	}

}
