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
public class AvancementEmploye {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
@ManyToOne
private Avancement avancement;
@ManyToOne
private Employe employe;
private Double montant;
@Temporal(TemporalType.DATE)
private Date dateAvancement;
@Temporal(TemporalType.DATE)
private Date dateDemande;
@ManyToOne
private EtatAvancement etatAvancement;
public AvancementEmploye() {
	super();
	// TODO Auto-generated constructor stub
}

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}
public Avancement getAvancement() {
	return avancement;
}
public void setAvancement(Avancement avancement) {
	this.avancement = avancement;
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}
public Double getMontant() {
	return montant;
}
public void setMontant(Double montant) {
	this.montant = montant;
}
public Date getDateAvancement() {
	return dateAvancement;
}
public void setDateAvancement(Date dateAvancement) {
	this.dateAvancement = dateAvancement;
}
public Date getDateDemande() {
	return dateDemande;
}
public void setDateDemande(Date dateDemande) {
	this.dateDemande = dateDemande;
}

public AvancementEmploye(Avancement avancement, Employe employe, Double montant, Date dateAvancement, Date dateDemande,
		EtatAvancement etatAvancement) {
	super();
	this.avancement = avancement;
	this.employe = employe;
	this.montant = montant;
	this.dateAvancement = dateAvancement;
	this.dateDemande = dateDemande;
	this.etatAvancement = etatAvancement;
}

public EtatAvancement getEtatAvancement() {
	return etatAvancement;
}

public void setEtatAvancement(EtatAvancement etatAvancement) {
	this.etatAvancement = etatAvancement;
}

@Override
public String toString() {
	return "AvancementEmploye [id=" + id + ", avancement=" + avancement + ", employe=" + employe + ", montant="
			+ montant + ", dateAvancement=" + dateAvancement + ", dateDemande=" + dateDemande + ", etatAvancement="
			+ etatAvancement + "]";
}


}
