package com.applicationweb.mairie.model;



import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import com.applicationweb.mairie.TypeRole;



@Entity
public class Role {
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id_Role;
	
	@Enumerated(EnumType.STRING)
	private TypeRole typeRole;
	
	//private List<User> users = new ArrayList<>();
	
	
	public Long getIdRole() {
		return id_Role;
	}
	public void setIdRole(Long id_Role) {
		this.id_Role = id_Role;
	}
	public TypeRole getTypeRole() {
		return typeRole;
	}
	public void setTypeRole(TypeRole typeRole) {
		this.typeRole = typeRole;
	}
	
	
	public Role(TypeRole typeRole) {
		super();
		this.typeRole = typeRole;
		
	}
	
	
	
	}
	
