package it.uniroma3.siw.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Societa {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	Long id;
	
	@Column(nullable=false)
	String via;
	@Column(nullable=false)
	Integer civico;
	@Column(nullable=false)
	String comune;
	@Column(nullable=false)
	String provincia;
	String regione;
	Integer CAP;
	
	
}
