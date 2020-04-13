package com.example.stock.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Prime {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
private String libelle;
private Double montant;

public Prime() {
	super();
	// TODO Auto-generated constructor stub
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public Prime(String libelle, Double montant) {
	super();
	this.libelle = libelle;
	this.montant = montant;
}
public Double getMontant() {
	return montant;
}
public void setMontant(Double montant) {
	this.montant = montant;
}
@Override
public String toString() {
	return "Prime [id=" + id + ", libelle=" + libelle + ", montant=" + montant + "]";
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}



}
