package com.applicationweb.mairie.model;


import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.applicationweb.mairie.TypeActe;


@Entity 
@Table(name="DEATH")
@DiscriminatorValue("DEATH")
public class Death  extends Act{
	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	private Long id;
	
	private String nomDecede;
	private String lieuDeces;
	private String ageDecede;
	private String domicileDecede;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person mere;
	
	@OneToOne(cascade = CascadeType.ALL)
	private Person pere;
	
	private String nomDeclarant;
	private String dateFabriqueActe;
	public Long getId() {
		return id;
	}
	public void setId_Death(Long id) {
		this.id = id;
	}
	public String getNomDecede() {
		return nomDecede;
	}
	public void setNomDecede(String nomDecede) {
		this.nomDecede = nomDecede;
	}
	public String getLieuDeces() {
		return lieuDeces;
	}
	public void setLieuDeces(String lieuDeces) {
		this.lieuDeces = lieuDeces;
	}
	public String getAgeDecede() {
		return ageDecede;
	}
	public void setAgeDecede(String ageDecede) {
		this.ageDecede = ageDecede;
	}
	public String getDomicileDecede() {
		return domicileDecede;
	}
	public void setDomicileDecede(String domicileDecede) {
		this.domicileDecede = domicileDecede;
	}
	public Person getMere() {
		return mere;
	}
	public void setMere(Person mere) {
		this.mere = mere;
	}
	public Person getPere() {
		return pere;
	}
	public void setPere(Person pere) {
		this.pere = pere;
	}
	public String getNomDeclarant() {
		return nomDeclarant;
	}
	public void setNomDeclarant(String nomDeclarant) {
		this.nomDeclarant = nomDeclarant;
	}
	public String getDateFabriqueActe() {
		return dateFabriqueActe;
	}
	public void setDateFabriqueActe(String dateFabriqueActe) {
		this.dateFabriqueActe = dateFabriqueActe;
	}
	
	public Death(TypeActe typeActe, Commune commune, String nomDecede, String lieuDeces, String ageDecede,
			String domicileDecede, Person mere, Person pere, String nomDeclarant, String dateFabriqueActe) {
		super(typeActe, commune);
		this.nomDecede = nomDecede;
		this.lieuDeces = lieuDeces;
		this.ageDecede = ageDecede;
		this.domicileDecede = domicileDecede;
		this.mere = mere;
		this.pere = pere;
		this.nomDeclarant = nomDeclarant;
		this.dateFabriqueActe = dateFabriqueActe;
	}
	
	
	
	
	
	
}
	
	
