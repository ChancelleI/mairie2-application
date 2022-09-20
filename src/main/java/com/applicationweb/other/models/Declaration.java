package com.applicationweb.other.models;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

@Entity
public class Declaration {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nomDeclarant;
	
	@OneToMany @JoinColumn(name="id_declaration")
	private List<Document> documents = new ArrayList<>();
	
	@ManyToOne @JoinColumn(name="id_declaration", nullable=false)
	private Person personne;
	
	@OneToOne
	private TypeDeclaration typeDeclaration ;

	public Declaration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Declaration(String nomDeclarant, List<Document> documents, Person personne,
			TypeDeclaration typeDeclaration) {
		super();
		this.nomDeclarant = nomDeclarant;
		this.documents = documents;
		this.personne = personne;
		this.typeDeclaration = typeDeclaration;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	@Override
	public String toString() {
		return "Declaration [id=" + id + ", nomDeclarant=" + nomDeclarant + ", documents=" + documents + ", personne="
				+ personne + ", typeDeclaration=" + typeDeclaration + "]";
	}

}
