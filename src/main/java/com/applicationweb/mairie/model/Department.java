package com.applicationweb.mairie.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;


@Entity
public class Department {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	private String nomDepartement;
	
	@ManyToOne  @JoinColumn(name = "id_Region ", nullable=false)
	private Region region ;
	
//	@OneToMany @JoinColumn(name="id_Department")
//	private List<Commune> communes =new ArrayList<>();
	
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
	
	public Region getRegion() {
		return region;
	}
	public void setRegion(Region region) {
		this.region = region;
	}
	public Department(String nomDepartement, Region region) {
		super();
		this.nomDepartement = nomDepartement;
		this.region = region;
	}
	
	
	

}
