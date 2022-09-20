package com.applicationweb.other.payload.request;

public class DocumentRequest {

	private String nom;

	private Long idTypeDocument;

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public Long getIdTypeDocument() {
		return idTypeDocument;
	}

	public void setIdTypeDocument(Long idTypeDocument) {
		this.idTypeDocument = idTypeDocument;
	}

	@Override
	public String toString() {
		return "DocumentRequest [nom=" + nom + ", idTypeDocument=" + idTypeDocument + "]";
	}

}
