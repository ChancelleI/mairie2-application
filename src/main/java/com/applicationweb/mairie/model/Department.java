package com.applicationweb.mairie.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Department {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String nomDepartement;
	
	@OneToMany @JoinColumn(name="id_Department")
	private List<Commune> communes =new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	public void setId_Department(Long id) {
		this.id = id;
	}
	public String getNomDepartement() {
		return nomDepartement;
	}
	public void setNomDepartement(String nomDepartement) {
		this.nomDepartement = nomDepartement;
	}
	
	public List<Commune> getCommunes() {
		return communes;
	}
	public void setCommunes(List<Commune> communes) {
		this.communes = communes;
	}
	
	public Department(String nomDepartement, List<Commune> communes) {
		super();
		this.nomDepartement = nomDepartement;
		this.communes = communes;
	}
	
	
	

}
