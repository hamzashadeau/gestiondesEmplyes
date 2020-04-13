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
public class Employe {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
private Long id;
private Long matricule;
private String fullName;
private String email;
private String gender;
private Integer cin;
private Integer cnss;
private Integer enfants;
private String adresse;
private String pays;
private Date dateDeNaissance;
private String password;
private Integer tel;
@ManyToOne
private Employe sup;
@ManyToOne
private Departement dep;
@Temporal(TemporalType.DATE)
private Date dateEntree;
@Temporal(TemporalType.DATE)
private Date dateSortie;
private Double montantDeBase;
private Double monatntModifie;
@ManyToOne
private Banque banque;

public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public Employe(Long matricule, String fullName, String email, String gender, Integer cin, Integer cnss, Integer enfants,
		String adresse, String pays, Date dateDeNaissance, String password, Integer tel, Employe sup, Departement dep,
		Date dateEntree, Date dateSortie, Double montantDeBase, Double monatntModifie, Banque banque) {
	super();
	this.matricule = matricule;
	this.fullName = fullName;
	this.email = email;
	this.gender = gender;
	this.cin = cin;
	this.cnss = cnss;
	this.enfants = enfants;
	this.adresse = adresse;
	this.pays = pays;
	this.dateDeNaissance = dateDeNaissance;
	this.password = password;
	this.tel = tel;
	this.sup = sup;
	this.dep = dep;
	this.dateEntree = dateEntree;
	this.dateSortie = dateSortie;
	this.montantDeBase = montantDeBase;
	this.monatntModifie = monatntModifie;
	this.banque = banque;
}
public Employe() {
	super();
	// TODO Auto-generated constructor stub
}
public String getFullName() {
	return fullName;
}
public void setFullName(String fullName) {
	this.fullName = fullName;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public Integer getCin() {
	return cin;
}
public void setCin(Integer cin) {
	this.cin = cin;
}
public Integer getCnss() {
	return cnss;
}
public void setCnss(Integer cnss) {
	this.cnss = cnss;
}
public Integer getEnfants() {
	return enfants;
}
public void setEnfants(Integer enfants) {
	this.enfants = enfants;
}
public String getAdresse() {
	return adresse;
}
public void setAdresse(String adresse) {
	this.adresse = adresse;
}
public String getPays() {
	return pays;
}
public void setPays(String pays) {
	this.pays = pays;
}
public Date getDateDeNaissance() {
	return dateDeNaissance;
}
public void setDateDeNaissance(Date dateDeNaissance) {
	this.dateDeNaissance = dateDeNaissance;
}
public Integer getTel() {
	return tel;
}
public void setTel(Integer tel) {
	this.tel = tel;
}
public Employe getSup() {
	return sup;
}
public void setSup(Employe sup) {
	this.sup = sup;
}
public Departement getDep() {
	return dep;
}
public void setDep(Departement dep) {
	this.dep = dep;
}
public Date getDateEntree() {
	return dateEntree;
}
public void setDateEntree(Date dateEntree) {
	this.dateEntree = dateEntree;
}
public Date getDateSortie() {
	return dateSortie;
}
public void setDateSortie(Date dateSortie) {
	this.dateSortie = dateSortie;
}
public Double getMontantDeBase() {
	return montantDeBase;
}
public void setMontantDeBase(Double montantDeBase) {
	this.montantDeBase = montantDeBase;
}
public Double getMonatntModifie() {
	return monatntModifie;
}
public void setMonatntModifie(Double monatntModifie) {
	this.monatntModifie = monatntModifie;
}
public Banque getBanque() {
	return banque;
}
public void setBanque(Banque banque) {
	this.banque = banque;
}

public Long getMatricule() {
	return matricule;
}
public void setMatricule(Long matricule) {
	this.matricule = matricule;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
@Override
public String toString() {
	return "Employe [id=" + id + ", matricule=" + matricule + ", fullName=" + fullName + ", email=" + email
			+ ", gender=" + gender + ", cin=" + cin + ", cnss=" + cnss + ", enfants=" + enfants + ", adresse=" + adresse
			+ ", pays=" + pays + ", dateDeNaissance=" + dateDeNaissance + ", password=" + password + ", tel=" + tel
			+ ", sup=" + sup + ", dep=" + dep + ", dateEntree=" + dateEntree + ", dateSortie=" + dateSortie
			+ ", montantDeBase=" + montantDeBase + ", monatntModifie=" + monatntModifie + ", banque=" + banque + "]";
}


}
