package com.applicationweb.other.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "documents") // classe d'entité associer a la table Document
//@Inheritance(strategy = InheritanceType.JOINED)
//@DiscriminatorColumn(name = "type_documente")
public class Document {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nom;

	@OneToOne
	private TypeDocument typeDocument;

	public Document() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Document(String nom, TypeDocument typeDocument) {
		super();
		this.nom = nom;
		this.typeDocument = typeDocument;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public TypeDocument getTypeDocument() {
		return typeDocument;
	}

	public void setTypeDocument(TypeDocument typeDocument) {
		this.typeDocument = typeDocument;
	}

	@Override
	public String toString() {
		return "Document [id=" + id + ", nom=" + nom + ", typeDocument=" + typeDocument + "]";
	}

}
