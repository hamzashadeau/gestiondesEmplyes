package com.example.stock.bean;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Congee {
@Id
@GeneratedValue(strategy =GenerationType.AUTO )
private Long id;
private String type;
public Congee() {
	super();
	// TODO Auto-generated constructor stub
}
public Congee(String type) {
	super();
	this.type = type;
}
@Override
public String toString() {
	return "Congee [id=" + id + ", type=" + type + "]";
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}



}
