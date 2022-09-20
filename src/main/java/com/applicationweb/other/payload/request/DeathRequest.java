package com.applicationweb.other.payload.request;

import com.applicationweb.other.models.Person;

public class DeathRequest {

	private Long idCommune;

	private Person decede;

	private String dateFabriqueACte;

	private Person mere;

	private Long idMere;

	private Person pere;

	private Long idPere;

	private DeclarationRequest declarationRequest;

	public Long getIdCommune() {
		return idCommune;
	}

	public void setIdCommune(Long idCommune) {
		this.idCommune = idCommune;
	}

	public Person getDecede() {
		return decede;
	}

	public void setDecede(Person decede) {
		this.decede = decede;
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

	public Long getIdMere() {
		return idMere;
	}

	public void setIdMere(Long idMere) {
		this.idMere = idMere;
	}

	public Person getPere() {
		return pere;
	}

	public void setPere(Person pere) {
		this.pere = pere;
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

	@Override
	public String toString() {
		return "DeathRequest [idCommune=" + idCommune + ", decede=" + decede + ", dateFabriqueACte=" + dateFabriqueACte
				+ ", mere=" + mere + ", idMere=" + idMere + ", pere=" + pere + ", idPere=" + idPere
				+ ", declarationRequest=" + declarationRequest + "]";
	}

}
