package com.applicationweb.other.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.applicationweb.other.enums.ETypeDeclaration;

@Entity
@Table(name = "typeDeclaration")
public class TypeDeclaration {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ETypeDeclaration name;

	public TypeDeclaration(ETypeDeclaration name) {
		super();
		this.name = name;
	}

	public TypeDeclaration() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ETypeDeclaration getName() {
		return name;
	}

	public void setName(ETypeDeclaration name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TypeDeclaration [id=" + id + ", name=" + name + "]";
	}

}
