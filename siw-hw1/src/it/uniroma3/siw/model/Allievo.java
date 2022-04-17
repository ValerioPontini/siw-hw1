package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Allievo {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	Long id;
	
	@Column(nullable = false)
	String nome;
	@Column(nullable = false)
	String cognome;
	@Column(nullable = false)
	Long matricola;
	LocalDate dataDiNascita;
	String luogoDiNascita;
	String mail;
	@ManyToMany(mappedBy = "allievi")
	List<Corso> corsi;
	@ManyToOne(cascade = { CascadeType.PERSIST, CascadeType.MERGE}) // è opportuno usare questo tipo di cascade perchè per ogni
	Societa azienda;																					//allievo è rilevante l'informazione sull'azienda di appartenenza e 
																						//di conseguenza, senza ciò,  si dovrebbe tener conto esplicitamente 
																						//di ogni eventuale modifica delle infromazioni di una società per 
																						//ogni allievo che le appartiene

	
}
