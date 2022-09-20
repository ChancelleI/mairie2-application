package com.applicationweb.other.models;

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
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nomCommune;

	@OneToOne(cascade = CascadeType.ALL)
	private Address address;

	@ManyToOne
	@JoinColumn(name = "id_Department ", nullable = false)
	private Department department;

//	@OneToMany @JoinColumn(name ="id_Commune") 
//	private List<User> users = new ArrayList<>();

	public Long getId_commune() {
		return id;
	}

	public void setId_commune(Long id) {
		this.id = id;
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
		return "Commune [id=" + id + ", nomCommune=" + nomCommune + ", address=" + address + ", department="
				+ department + "]";
	}

}
