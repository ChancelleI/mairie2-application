package com.applicationweb.mairie.model;



import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Region {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
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

	

	
	
	
	
	
	
	
	
	
	}
	
