package com.example.stock.bean;


import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Absence {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
@ManyToOne
private Employe employe;
@Temporal(TemporalType.DATE)
private Date date;
private String reason;
public Absence() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}
public String getReason() {
	return reason;
}
public void setReason(String reason) {
	this.reason = reason;
}
public Absence(Employe employe, Date date, String reason) {
	super();
	this.employe = employe;
	this.date = date;
	this.reason = reason;
}
@Override
public String toString() {
	return "Absence [id=" + id + ", employe=" + employe + ", date=" + date + ", reason=" + reason + "]";
}



}
