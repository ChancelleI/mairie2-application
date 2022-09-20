package com.applicationweb.other.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.applicationweb.other.enums.ETypeDocument;

@Entity
@Table(name = "typeDocument")
public class TypeDocument {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ETypeDocument name;

	public TypeDocument(ETypeDocument name) {
		super();
		this.name = name;
	}

	public TypeDocument() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ETypeDocument getName() {
		return name;
	}

	public void setName(ETypeDocument name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TypeDocument [id=" + id + ", name=" + name + "]";
	}

}
