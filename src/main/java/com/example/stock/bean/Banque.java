package com.example.stock.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Banque {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
private String libelle;
private Double rib;
public Banque() {
	super();
	// TODO Auto-generated constructor stub
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public Banque(String libelle, Double rib) {
	super();
	this.libelle = libelle;
	this.rib = rib;
}
@Override
public String toString() {
	return "Banque [id=" + id + ", libelle=" + libelle + ", rib=" + rib + "]";
}
public Double getRib() {
	return rib;
}
public void setRib(Double rib) {
	this.rib = rib;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}



}
