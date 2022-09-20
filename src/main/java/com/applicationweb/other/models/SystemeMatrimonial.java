package com.applicationweb.other.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.applicationweb.other.enums.ESystemeMatrimonial;

@Entity
@Table(name = "systemeMatrimonial")
public class SystemeMatrimonial {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ESystemeMatrimonial name;

	public SystemeMatrimonial(ESystemeMatrimonial name) {
		super();
		this.name = name;
	}

	public SystemeMatrimonial() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ESystemeMatrimonial getName() {
		return name;
	}

	public void setName(ESystemeMatrimonial name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "SystemeMatrimonial [id=" + id + ", name=" + name + "]";
	}

}
