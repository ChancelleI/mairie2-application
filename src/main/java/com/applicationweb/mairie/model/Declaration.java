package com.applicationweb.mairie.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import com.applicationweb.mairie.TypeDeclaration;

@Entity
@DiscriminatorColumn(name="type_declaration")
public class Declaration {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String nomDeclarant;
	
	@OneToMany @JoinColumn(name="id_declaration")
	private List<Document> documents = new ArrayList<>();
	
	@ManyToOne @JoinColumn(name="id_declaration", nullable=false)
	private Person personne;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "type_declaration")
	private TypeDeclaration typeDeclaration ;
	
	public Long getId() {
		return id;
	}
	public void setIdDeclaration(Long id) {
		this.id = id;
	}
	public String getNomDeclarant() {
		return nomDeclarant;
	}
	public void setNomDeclarant(String nomDeclarant) {
		this.nomDeclarant = nomDeclarant;
	}
	
	public List<Document> getDocuments() {
		return documents;
	}
	public void setDocuments(List<Document> documents) {
		this.documents = documents;
	}
	public Person getPersonne() {
		return personne;
	}
	public void setPersonne(Person personne) {
		this.personne = personne;
	}
	public TypeDeclaration getTypeDeclaration() {
		return typeDeclaration;
	}
	public void setTypeDeclaration(TypeDeclaration typeDeclaration) {
		this.typeDeclaration = typeDeclaration;
	}
	
	public Declaration(String nomDeclarant, List<Document> documents, Person personne,
			TypeDeclaration typeDeclaration) {
		super();
		this.nomDeclarant = nomDeclarant;
		this.documents = documents;
		this.personne = personne;
		this.typeDeclaration = typeDeclaration;
	}
	
	
	
	
	
	
	
	
	
	


}
