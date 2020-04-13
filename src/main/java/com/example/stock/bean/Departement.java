package com.example.stock.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Departement {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
private String nomDepartemant;
@ManyToOne
private Employe sup;
public String getNomDepartemant() {
	return nomDepartemant;
}
public void setNomDepartemant(String nomDepartemant) {
	this.nomDepartemant = nomDepartemant;
}
public Departement(String nomDepartemant, Employe sup) {
	super();
	this.nomDepartemant = nomDepartemant;
	this.sup = sup;
}
public Employe getSup() {
	return sup;
}
public void setSup(Employe sup) {
	this.sup = sup;
}
@Override
public String toString() {
	return "Departement [id=" + id + ", nomDepartemant=" + nomDepartemant + ", sup=" + sup + "]";
}
public Departement() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

}
