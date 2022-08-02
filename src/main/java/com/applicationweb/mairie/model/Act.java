package com.applicationweb.mairie.model;


import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.applicationweb.mairie.TypeActe;

@Entity @Table(name="act") //classe d'entité associer a la table Act
@Inheritance(strategy=InheritanceType.JOINED)
@DiscriminatorColumn(name="type_acte")
public class Act {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	protected Long id;
	
	
	@Enumerated(EnumType.STRING)
	@Column(name = "type_acte")
	protected TypeActe typeActe;
	
	@ManyToOne @JoinColumn(name ="id_Commune" , nullable=false)
	protected Commune commune;
	
	//@ManyToOne  @JoinColumn(name = "id_Person ", nullable=false)
	//private Person person ;
	
	public Long getId() {
		return id;
	}
	public void setIdAct(Long id) {
		this.id = id;
	}
	
	public TypeActe getTypeActe() {
		return typeActe;
	}
	public void setTypeActe(TypeActe typeActe) {
		this.typeActe = typeActe;
	}
	
	public Commune getCommune() {
		return commune;
	}
	public void setCommune(Commune commune) {
		this.commune = commune;
	}
	
	public Act(TypeActe typeActe, Commune commune) {
		super();
		this.typeActe = typeActe;
		this.commune = commune;
	}
	
	
	

}
