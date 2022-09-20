package com.applicationweb.other.models;

import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "DEATH")
@DiscriminatorValue("DEATH")
public class Death extends Act {

	@OneToOne
	private Person decede;

	@OneToOne(cascade = CascadeType.ALL)
	private Person mere;

	@OneToOne(cascade = CascadeType.ALL)
	private Person pere;

	@OneToOne(cascade = CascadeType.ALL)
	private Declaration declaration;

	private String dateFabriqueACte;

	public Death() {

	}

	public Death(Person decede, Person mere, Person pere, Declaration declaration, String dateFabriqueACte) {
		super();
		this.decede = decede;
		this.mere = mere;
		this.pere = pere;
		this.declaration = declaration;
		this.dateFabriqueACte = dateFabriqueACte;
	}

	public Death(Commune commune, TypeActe typeActe, Person decede, Person mere, Person pere, Declaration declaration,
			String dateFabriqueACte) {
		super(typeActe, commune);
		this.decede = decede;
		this.mere = mere;
		this.pere = pere;
		this.declaration = declaration;
		this.dateFabriqueACte = dateFabriqueACte;
	}

	@Override
	public String toString() {
		return "Death [decede=" + decede + ", mere=" + mere + ", pere=" + pere + ", declaration=" + declaration
				+ ", dateFabriqueACte=" + dateFabriqueACte + "]";
	}

}
