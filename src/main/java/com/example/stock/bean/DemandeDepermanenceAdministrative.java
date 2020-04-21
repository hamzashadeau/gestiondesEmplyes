package com.example.stock.bean;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class DemandeDepermanenceAdministrative {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
private String motif;
@ManyToOne
private Employe employe;
@ManyToOne
private Employe chef;
@Temporal(TemporalType.DATE)
private Date dateDeDemande;
@Temporal(TemporalType.DATE)
private Date dateDeTravail;
public DemandeDepermanenceAdministrative() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getMotif() {
	return motif;
}
public void setMotif(String motif) {
	this.motif = motif;
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}
public Employe getChef() {
	return chef;
}
public void setChef(Employe chef) {
	this.chef = chef;
}
public Date getDateDeDemande() {
	return dateDeDemande;
}
public void setDateDeDemande(Date dateDeDemande) {
	this.dateDeDemande = dateDeDemande;
}
public Date getDateDeTravail() {
	return dateDeTravail;
}
public void setDateDeTravail(Date dateDeTravail) {
	this.dateDeTravail = dateDeTravail;
}
public DemandeDepermanenceAdministrative(String motif, Employe employe, Employe chef, Date dateDeDemande,
		Date dateDeTravail) {
	super();
	this.motif = motif;
	this.employe = employe;
	this.chef = chef;
	this.dateDeDemande = dateDeDemande;
	this.dateDeTravail = dateDeTravail;
}

@Override
public String toString() {
	return "DemandeDepermanenceAdministrative [id=" + id + ", motif=" + motif + ", employe=" + employe + ", chef="
			+ chef + ", dateDeDemande=" + dateDeDemande + ", dateDeTravail=" + dateDeTravail + "]";
}



}
