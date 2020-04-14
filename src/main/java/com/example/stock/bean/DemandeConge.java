package com.example.stock.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
public class DemandeConge {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
@ManyToOne
private TypeCongee typeCongee;
@ManyToOne
private Employe employe;
@Temporal(TemporalType.DATE)
private Date dateDeDebut;
@Temporal(TemporalType.DATE)
private Date dateDeFin;
private String etat;

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public Date getDateDeDebut() {
	return dateDeDebut;
}

public void setDateDeDebut(Date dateDeDebut) {
	this.dateDeDebut = dateDeDebut;
}

public Date getDateDeFin() {
	return dateDeFin;
}

public void setDateDeFin(Date dateDeFin) {
	this.dateDeFin = dateDeFin;
}


public String getEtat() {
	return etat;
}

public void setEtat(String etat) {
	this.etat = etat;
}

public DemandeConge() {
	super();
	// TODO Auto-generated constructor stub
}

public TypeCongee getCongee() {
	return typeCongee;
}
public void setCongee(TypeCongee typeCongee) {
	this.typeCongee = typeCongee;
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}

public TypeCongee getTypeCongee() {
	return typeCongee;
}

public void setTypeCongee(TypeCongee typeCongee) {
	this.typeCongee = typeCongee;
}

public DemandeConge(TypeCongee typeCongee, Employe employe, Date dateDeDebut, Date dateDeFin, String etat) {
	super();
	this.typeCongee = typeCongee;
	this.employe = employe;
	this.dateDeDebut = dateDeDebut;
	this.dateDeFin = dateDeFin;
	this.etat = etat;
}


}
