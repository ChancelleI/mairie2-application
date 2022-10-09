package com.applicationweb.mairie.model;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Role {
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String typeRole;

	public Role() {
		super();
	}
	
	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTypeRole() {
		return typeRole;
	}


	public void setTypeRole(String typeRole) {
		this.typeRole = typeRole;
	}


	public void setType_role(String type_role) {
		this.typeRole = type_role;
	}

	public Role(Long id, String typeRole) {
		super();
		this.id = id;
		this.typeRole = typeRole;
	}

	@Override
	public String toString() {
		return "Role [id=" + id + ", typeRole=" + typeRole + "]";
	}
	
	
}
	
