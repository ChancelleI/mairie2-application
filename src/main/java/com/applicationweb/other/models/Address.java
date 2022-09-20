package com.applicationweb.other.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class Address {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@JsonProperty("id")
	private Long id;

	private String ville;

	private Long contact;

//	@Email
	private String email;

	private String quartier;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public Long getContact() {
		return contact;
	}

	public void setContact(Long contact) {
		this.contact = contact;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getQuartier() {
		return quartier;
	}

	public void setQuartier(String quartier) {
		this.quartier = quartier;
	}

	public Address() {

	}

	public Address(String ville, Long contact, String email, String quartier) {
		super();
		this.ville = ville;
		this.contact = contact;
		this.email = email;
		this.quartier = quartier;
	}

	@Override
	public String toString() {
		return "Address [id=" + id + ", ville=" + ville + ", contact=" + contact + ", email=" + email + ", quartier="
				+ quartier + "]";
	}

}
