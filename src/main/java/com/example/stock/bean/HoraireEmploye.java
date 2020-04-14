package com.example.stock.bean;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class HoraireEmploye {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
@Temporal(TemporalType.DATE )
private Date date;
@Temporal(TemporalType.TIME)
private Date heureDeEntree;
@Temporal(TemporalType.TIME)
private Date heureDeSortie;
public HoraireEmploye() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
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
public HoraireEmploye(Date date, Date heureDeEntree, Date heureDeSortie) {
	super();
	this.date = date;
	this.heureDeEntree = heureDeEntree;
	this.heureDeSortie = heureDeSortie;
}



}
