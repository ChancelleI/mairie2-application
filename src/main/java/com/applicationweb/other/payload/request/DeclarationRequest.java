package com.applicationweb.other.payload.request;

import java.util.List;

import com.applicationweb.other.models.Person;

public class DeclarationRequest {

	private String nomDeclarant;

	private List<DocumentRequest> documents;

	private Person personne;

	private Long idPersonne;

	private Long idTypeDeclaration;

	public String getNomDeclarant() {
		return nomDeclarant;
	}

	public void setNomDeclarant(String nomDeclarant) {
		this.nomDeclarant = nomDeclarant;
	}

	public List<DocumentRequest> getDocumentRequests() {
		return documents;
	}

	public void setDocumentRequests(List<DocumentRequest> documents) {
		this.documents = documents;
	}

	public Person getPersonne() {
		return personne;
	}

	public void setPersonne(Person personne) {
		this.personne = personne;
	}

	public Long getIdPersonne() {
		return idPersonne;
	}

	public void setIdPersonne(Long idPersonne) {
		this.idPersonne = idPersonne;
	}

	public Long getIdTypeDeclaration() {
		return idTypeDeclaration;
	}

	public void setIdTypeDeclaration(Long idTypeDeclaration) {
		this.idTypeDeclaration = idTypeDeclaration;
	}

	@Override
	public String toString() {
		return "DeclarationRequest [nomDeclarant=" + nomDeclarant + ", documents=" + documents + ", personne="
				+ personne + ", idPersonne=" + idPersonne + ", idTypeDeclaration=" + idTypeDeclaration + "]";
	}

}
