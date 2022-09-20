package com.applicationweb.other.payload.request;

import com.applicationweb.other.models.Address;

public class CommuneRequest {

	private String nomCommune;

	private Address address;

	private Long idDepartment;

	public String getNomCommune() {
		return nomCommune;
	}

	public void setNomCommune(String nomCommune) {
		this.nomCommune = nomCommune;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Long getIdDepartment() {
		return idDepartment;
	}

	public void setIdDepartment(Long idDepartment) {
		this.idDepartment = idDepartment;
	}

}
