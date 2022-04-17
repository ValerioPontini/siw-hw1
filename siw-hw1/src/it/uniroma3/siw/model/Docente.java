package it.uniroma3.siw.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Docente {

	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	Long id;
	@Column(nullable=false)
	String nome;
	@Column(nullable=false)
	String cognome;
	LocalDate nascita;
	String luogoNascita;
	Long iva;
	@OneToMany(mappedBy = "docente", fetch = FetchType.EAGER) //si sceglie di utilizzare la strategia di fetch Eager invece che quella di default Lazy
															  //poichè nel sistema descritto accedendo all'inzormazioni di un docente si sarà sicuramente 
															  //interessati a conoscere quali corsi tiene e di conseguenza è utile che anche questa informazione
															  //venga caricata insieme alle altre 
	List<Corso> corsi; 
	
	
}
