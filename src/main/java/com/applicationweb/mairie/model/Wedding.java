package com.applicationweb.mairie.model;



import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.applicationweb.mairie.RegimeBien;
import com.applicationweb.mairie.SystemeMatrimonial;

import com.applicationweb.mairie.TypeActe;



@Entity
@Table(name="WEDDING")
@DiscriminatorValue("WEDDING")
public class Wedding extends Act{
	
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person epoux;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person epouse;
	
	private String nomPereEpoux;
	private String nomMereEpoux;
	private String nomPereEpouse;
	private String nomMereEpouse; 
	private String nomTemoinEpoux;
	private String nomTemoinEpouse;
	private String nomOfficier;
	private String nomAssistant;
	
	private Date dateMariage;
	private String photoCouple;
	
	
	//@OneToMany  
	//@JoinColumn(name="id_Wedding") 
	//private List<Person> persons = new ArrayList<>();
	
	@OneToMany 
	@JoinColumn(name="id_Wedding")
	private List<Document> documents = new ArrayList<>();

	
	@Enumerated(EnumType.STRING)
	private RegimeBien regimeBien;
	
	@Enumerated(EnumType.STRING)
	private SystemeMatrimonial systemeMatrimonial;
	public String getNomPereEpoux() {
		return nomPereEpoux;
	}

	public void setNomPereEpoux(String nomPereEpoux) {
		this.nomPereEpoux = nomPereEpoux;
	}

	public String getNomMereEpoux() {
		return nomMereEpoux;
	}

	public void setNomMereEpoux(String nomMereEpoux) {
		this.nomMereEpoux = nomMereEpoux;
	}

	public String getNomPereEpouse() {
		return nomPereEpouse;
	}

	public void setNomPereEpouse(String nomPereEpouse) {
		this.nomPereEpouse = nomPereEpouse;
	}

	public String getNomMereEpouse() {
		return nomMereEpouse;
	}

	public void setNomMereEpouse(String nomMereEpouse) {
		this.nomMereEpouse = nomMereEpouse;
	}

	public String getNomTemoinEpoux() {
		return nomTemoinEpoux;
	}

	public void setNomTemoinEpoux(String nomTemoinEpoux) {
		this.nomTemoinEpoux = nomTemoinEpoux;
	}

	public String getNomTemoinEpouse() {
		return nomTemoinEpouse;
	}

	public void setNomTemoinEpouse(String nomTemoinEpouse) {
		this.nomTemoinEpouse = nomTemoinEpouse;
	}

	public String getNomOfficier() {
		return nomOfficier;
	}

	public void setNomOfficier(String nomOfficier) {
		this.nomOfficier = nomOfficier;
	}

	public String getNomAssistant() {
		return nomAssistant;
	}

	public void setNomAssistant(String nomAssistant) {
		this.nomAssistant = nomAssistant;
	}

	public Date getDateMariage() {
		return dateMariage;
	}

	public void setDateMariage(Date dateMariage) {
		this.dateMariage = dateMariage;
	}

	public String getPhotoCouple() {
		return photoCouple;
	}

	public void setPhotoCouple(String photoCouple) {
		this.photoCouple = photoCouple;
	}

	public List<Document> getDocuments() {
			return documents;
		}

		public void setDocuments(List<Document> documents) {
			this.documents = documents;
		}

		public RegimeBien getRegimeBien() {
			return regimeBien;
		}

		public void setRegimeBien(RegimeBien regimeBien) {
			this.regimeBien = regimeBien;
		}

		public SystemeMatrimonial getSystemeMatrimonial() {
			return systemeMatrimonial;
		}

		public void setSystemeMatrimonial(SystemeMatrimonial systemeMatrimonial) {
			this.systemeMatrimonial = systemeMatrimonial;
		}


		public Wedding(TypeActe typeActe, Commune commune, Person epoux, Person epouse, String nomPereEpoux,
				String nomMereEpoux, String nomPereEpouse, String nomMereEpouse, String nomTemoinEpoux,
				String nomTemoinEpouse, String nomOfficier, String nomAssistant, Date dateMariage, String photoCouple,
				List<Document> documents, RegimeBien regimeBien, SystemeMatrimonial systemeMatrimonial) {
			super(typeActe, commune);
			this.epoux = epoux;
			this.epouse = epouse;
			this.nomPereEpoux = nomPereEpoux;
			this.nomMereEpoux = nomMereEpoux;
			this.nomPereEpouse = nomPereEpouse;
			this.nomMereEpouse = nomMereEpouse;
			this.nomTemoinEpoux = nomTemoinEpoux;
			this.nomTemoinEpouse = nomTemoinEpouse;
			this.nomOfficier = nomOfficier;
			this.nomAssistant = nomAssistant;
			this.dateMariage = dateMariage;
			this.photoCouple = photoCouple;
			this.documents = documents;
			this.regimeBien = regimeBien;
			this.systemeMatrimonial = systemeMatrimonial;
		}

		
		
	

	
	

	

	
	
	

}
