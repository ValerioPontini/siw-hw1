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
public class Corso {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	Long id;
	
	@Column(nullable = false)
	String nome;
	LocalDate inizio;
	Integer durata;
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}) //in questo caso si utilizza questa strategia di cascade 
																   //poichè senza questa ogni volta che vengono cambiati i dati 
																   //di un docente bisognerebbe manualmente aggiornarli in tutti i corsi da lui tenuti.
	Docente docente;
	@ManyToMany
	List<Allievo> allievi;
}
