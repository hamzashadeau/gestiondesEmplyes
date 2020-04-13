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
import javax.persistence.criteria.CriteriaBuilder.In;

@Entity
public class Horraire {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
private Integer nbrdeJours;
@Temporal(TemporalType.TIME)
private Date heureDeEntree;
@Temporal(TemporalType.TIME)
private Date heureDeSortie;
@ManyToOne
private Fonction fonction;
public Integer getNbrdeJours() {
	return nbrdeJours;
}
public void setNbrdeJours(Integer nbrdeJours) {
	this.nbrdeJours = nbrdeJours;
}
public Date getHeureDeEntree() {
	return heureDeEntree;
}
public void setHeureDeEntree(Date heureDeEntree) {
	this.heureDeEntree = heureDeEntree;
}
public Date getHeureDeSortie() {
	return heureDeSortie;
}
public void setHeureDeSortie(Date heureDeSortie) {
	this.heureDeSortie = heureDeSortie;
}
public Fonction getFonction() {
	return fonction;
}
public void setFonction(Fonction fonction) {
	this.fonction = fonction;
}
public Horraire(Integer nbrdeJours, Date heureDeEntree, Date heureDeSortie, Fonction fonction) {
	super();
	this.nbrdeJours = nbrdeJours;
	this.heureDeEntree = heureDeEntree;
	this.heureDeSortie = heureDeSortie;
	this.fonction = fonction;
}
@Override
public String toString() {
	return "Horraire [id=" + id + ", nbrdeJours=" + nbrdeJours + ", heureDeEntree=" + heureDeEntree + ", heureDeSortie="
			+ heureDeSortie + ", fonction=" + fonction + "]";
}
public Horraire() {
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
