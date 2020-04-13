package com.example.stock.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class PrimeEmploye {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
@ManyToOne
private Prime prime;
@ManyToOne
private Employe employe;
public PrimeEmploye() {
	super();
	// TODO Auto-generated constructor stub
}
public PrimeEmploye(Prime prime, Employe employe) {
	super();
	this.prime = prime;
	this.employe = employe;
}
@Override
public String toString() {
	return "PrimeEmploye [id=" + id + ", prime=" + prime + ", employe=" + employe + "]";
}
public Prime getPrime() {
	return prime;
}
public void setPrime(Prime prime) {
	this.prime = prime;
}
public Employe getEmploye() {
	return employe;
}
public void setEmploye(Employe employe) {
	this.employe = employe;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}

}
