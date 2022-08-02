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
public class Region {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String nomRegion;
	
	@OneToMany @JoinColumn(name="id_Region")
	private List<Department> departments= new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

	public List<Department> getDepartments() {
		return departments;
	}

	public void setDepartments(List<Department> departments) {
		this.departments = departments;
	}

	public Region(String nomRegion, List<Department> departments) {
		super();
		this.nomRegion = nomRegion;
		this.departments = departments;
	}
	
	
	
	
	
	
	
	
	}
	
