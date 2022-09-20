package com.applicationweb.other.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
@Table(uniqueConstraints = { @UniqueConstraint(columnNames = "nomRegion") })
public class Region {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomRegion;

//	@OneToMany @JoinColumn(name="id_Region")
//	private List<Department> departments= new ArrayList<>();

	public Region() {

	}

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

	public Region(String nomRegion) {
		super();
		this.nomRegion = nomRegion;
	}

	@Override
	public String toString() {
		return "Region [id=" + id + ", nomRegion=" + nomRegion + "]";
	}

}
