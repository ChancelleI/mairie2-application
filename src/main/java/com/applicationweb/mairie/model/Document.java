package com.applicationweb.mairie.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.applicationweb.mairie.TypeDocument;
@Entity
@DiscriminatorColumn(name="type_documents")
public class Document {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id_Document;
	private String nomDocument;
	
	//@ManyToOne @JoinColumn(name="id_document", nullable=false)
	//private Declaration declaration;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "type_documents")
	private TypeDocument typeDocument;
	
	public Long getIdDocument() {
		return id_Document;
	}
	public void setIdDocument(Long id_Document) {
		this.id_Document = id_Document;
	}
	public String getNomDocument() {
		return nomDocument;
	}
	public void setNomDocument(String nomDocument) {
		this.nomDocument = nomDocument;
	}
	
//	public Declaration getDeclaration() {
//		return declaration;
//	}
//	public void setDeclaration(Declaration declaration) {
//		this.declaration = declaration;
//	}
	public TypeDocument getTypeDocument() {
		return typeDocument;
	}
	public void setTypeDocument(TypeDocument typeDocument) {
		this.typeDocument = typeDocument;
	}
	public Document(String nomDocument, TypeDocument typeDocument) {
		super();
		this.nomDocument = nomDocument;
		this.typeDocument = typeDocument;
	}
	
	
	
	
	
	}
	
