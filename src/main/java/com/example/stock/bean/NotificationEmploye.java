package com.example.stock.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class NotificationEmploye {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
@ManyToOne
private Employe emeteur;
@ManyToOne
private Employe destinataire;
@ManyToOne
private Notification notification;
private String message;
public NotificationEmploye() {
	super();
	// TODO Auto-generated constructor stub
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Employe getEmeteur() {
	return emeteur;
}
public void setEmeteur(Employe emeteur) {
	this.emeteur = emeteur;
}
public Employe getDestinataire() {
	return destinataire;
}
public void setDestinataire(Employe destinataire) {
	this.destinataire = destinataire;
}
public String getMessage() {
	return message;
}
public void setMessage(String message) {
	this.message = message;
}
public NotificationEmploye(Employe emeteur, Employe destinataire, Notification notification, String message) {
	super();
	this.emeteur = emeteur;
	this.destinataire = destinataire;
	this.notification = notification;
	this.message = message;
}
@Override
public String toString() {
	return "NotificationEmploye [id=" + id + ", emeteur=" + emeteur + ", destinataire=" + destinataire
			+ ", notification=" + notification + ", message=" + message + "]";
}


}
