package com.example.stock.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SoldeCongeeEmploye {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
private Integer year;
private Integer soldecetteAnneé;
private Integer soldeRestantesAnneDernier;
private Integer soldeRestantesCetteAnne;
@ManyToOne
private Employe employe;
public SoldeCongeeEmploye() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Integer getYear() {
	return year;
}
public void setYear(Integer year) {
	this.year = year;
}
public Integer getSoldecetteAnneé() {
	return soldecetteAnneé;
}
public void setSoldecetteAnneé(Integer soldecetteAnneé) {
	this.soldecetteAnneé = soldecetteAnneé;
}
public Integer getSoldeRestantesAnneDernier() {
	return soldeRestantesAnneDernier;
}
public void setSoldeRestantesAnneDernier(Integer soldeRestantesAnneDernier) {
	this.soldeRestantesAnneDernier = soldeRestantesAnneDernier;
}
public Integer getSoldeRestantesCetteAnne() {
	return soldeRestantesCetteAnne;
}
public void setSoldeRestantesCetteAnne(Integer soldeRestantesCetteAnne) {
	this.soldeRestantesCetteAnne = soldeRestantesCetteAnne;
}
public SoldeCongeeEmploye(Integer year, Integer soldecetteAnneé, Integer soldeRestantesAnneDernier,
		Integer soldeRestantesCetteAnne, Employe employe) {
	super();
	this.year = year;
	this.soldecetteAnneé = soldecetteAnneé;
	this.soldeRestantesAnneDernier = soldeRestantesAnneDernier;
	this.soldeRestantesCetteAnne = soldeRestantesCetteAnne;
	this.employe = employe;
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}
@Override
public String toString() {
	return "SoldeCongeeEmploye [id=" + id + ", year=" + year + ", soldecetteAnneé=" + soldecetteAnneé
			+ ", soldeRestantesAnneDernier=" + soldeRestantesAnneDernier + ", soldeRestantesCetteAnne="
			+ soldeRestantesCetteAnne + ", employe=" + employe + "]";
}




}
