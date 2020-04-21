package com.example.stock.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class SalaireEmploye {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
private Double montantDeBase;
private Double monatntModifie;
@ManyToOne
private Employe employe;
public SalaireEmploye() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Double getMontantDeBase() {
	return montantDeBase;
}
public void setMontantDeBase(Double montantDeBase) {
	this.montantDeBase = montantDeBase;
}
public Double getMonatntModifie() {
	return monatntModifie;
}
public void setMonatntModifie(Double monatntModifie) {
	this.monatntModifie = monatntModifie;
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}
public SalaireEmploye(Double montantDeBase, Double monatntModifie, Employe employe) {
	super();
	this.montantDeBase = montantDeBase;
	this.monatntModifie = monatntModifie;
	this.employe = employe;
}
@Override
public String toString() {
	return "SalaireEmploye [id=" + id + ", montantDeBase=" + montantDeBase + ", monatntModifie=" + monatntModifie
			+ ", employe=" + employe + "]";
}



}
