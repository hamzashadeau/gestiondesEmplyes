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
public class CongéEmploye {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
@ManyToOne
private Congee congee;
@ManyToOne
private Employe employe;
@Temporal(TemporalType.DATE)
private Date dateDeDebut;
@Temporal(TemporalType.DATE)
private Date dateDeFin;
private Integer nbrjours;
private Integer nbrjoursRestantes;
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

public Integer getNbrjours() {
	return nbrjours;
}

public void setNbrjours(Integer nbrjours) {
	this.nbrjours = nbrjours;
}

public String getEtat() {
	return etat;
}

public void setEtat(String etat) {
	this.etat = etat;
}

public CongéEmploye() {
	super();
	// TODO Auto-generated constructor stub
}

public Congee getCongee() {
	return congee;
}
public void setCongee(Congee congee) {
	this.congee = congee;
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}

public CongéEmploye(Congee congee, Employe employe, Date dateDeDebut, Date dateDeFin, Integer nbrjours,
		Integer nbrjoursRestantes, String etat) {
	super();
	this.congee = congee;
	this.employe = employe;
	this.dateDeDebut = dateDeDebut;
	this.dateDeFin = dateDeFin;
	this.nbrjours = nbrjours;
	this.nbrjoursRestantes = nbrjoursRestantes;
	this.etat = etat;
}

@Override
public String toString() {
	return "CongéEmploye [id=" + id + ", congee=" + congee + ", employe=" + employe + ", dateDeDebut=" + dateDeDebut
			+ ", dateDeFin=" + dateDeFin + ", nbrjours=" + nbrjours + ", nbrjoursRestantes=" + nbrjoursRestantes
			+ ", etat=" + etat + "]";
}

public Integer getNbrjoursRestantes() {
	return nbrjoursRestantes;
}

public void setNbrjoursRestantes(Integer nbrjoursRestantes) {
	this.nbrjoursRestantes = nbrjoursRestantes;
}


}
