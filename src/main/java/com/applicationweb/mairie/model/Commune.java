package com.applicationweb.mairie.model;



import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;


@Entity  
public class Commune {

	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id_commune;
	private String nomCommune;
	
	@OneToOne(cascade = CascadeType.ALL) 
	private Address address;
	
	@ManyToOne  @JoinColumn(name = "id_Department ", nullable=false)
	private Department department ;

	public Long getId_commune() {
		return id_commune;
	}

	public void setId_commune(Long id_commune) {
		this.id_commune = id_commune;
	}

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Commune() {
		
		
	}

	public Commune(String nomCommune, Address address, Department department) {
		super();
		this.nomCommune = nomCommune;
		this.address = address;
		this.department = department;
	}

	@Override
	public String toString() {
		return "Commune [id_commune=" + id_commune + ", nomCommune=" + nomCommune + ", address=" + address
				+ ", department=" + department + "]";
	}

	
	}
		