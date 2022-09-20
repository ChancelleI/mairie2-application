package com.applicationweb.other.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "nomDepartment") })
public class Department {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomDepartment;

	@ManyToOne
	@JoinColumn(name = "id_Region ", nullable = false)
	private Region region;

//	@OneToMany @JoinColumn(name="id_Department")
//	private List<Commune> communes =new ArrayList<>();

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomDepartment() {
		return nomDepartment;
	}

	public void setNomDepartment(String nomDepartment) {
		this.nomDepartment = nomDepartment;
	}

	public Region getRegion() {
		return region;
	}

	public void setRegion(Region region) {
		this.region = region;
	}

	public Department() {
		super();
	}

	public Department(String nomDepartment, Region region) {
		super();
		this.nomDepartment = nomDepartment;
		this.region = region;
	}

	@Override
	public String toString() {
		return "Department [id=" + id + ", nomDepartment=" + nomDepartment + ", region=" + region + "]";
	}

}
