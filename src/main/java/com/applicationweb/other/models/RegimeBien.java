package com.applicationweb.other.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.applicationweb.other.enums.ERegimeBien;

@Entity
@Table(name = "regimeBien")
public class RegimeBien {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private ERegimeBien name;

	public RegimeBien(ERegimeBien name) {
		super();
		this.name = name;
	}

	public RegimeBien() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ERegimeBien getName() {
		return name;
	}

	public void setName(ERegimeBien name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "RegimeBien [id=" + id + ", name=" + name + "]";
	}

}
