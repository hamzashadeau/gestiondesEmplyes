package com.example.stock.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Avancement {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
private String libelle;
private Double taux;
public Avancement() {
	super();
	// TODO Auto-generated constructor stub
}
public Avancement(Long id, String libelle) {
	super();
	this.id = id;
	this.libelle = libelle;
}
@Override
public String toString() {
	return "Fonction [id=" + id + ", libelle=" + libelle + "]";
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Double getTaux() {
	return taux;
}
public void setTaux(Double taux) {
	this.taux = taux;
}

}