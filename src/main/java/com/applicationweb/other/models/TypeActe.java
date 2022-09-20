package com.applicationweb.other.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.applicationweb.other.enums.ETypeActe;

@Entity
@Table(name = "typeActe")
public class TypeActe {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ETypeActe name;

	public TypeActe() {

	}

	public TypeActe(ETypeActe name) {
		super();
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ETypeActe getName() {
		return name;
	}

	public void setName(ETypeActe name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "TypeActe [id=" + id + ", name=" + name + "]";
	}

}
