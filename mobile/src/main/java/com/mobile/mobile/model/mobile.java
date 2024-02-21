package com.mobile.mobile.model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class mobile {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;
private int model ;
private String name;
private long price;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public int getModel() {
	return model;
}
public void setModel(int model) {
	this.model = model;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public long getPrice() {
	return price;
}
public void setPrice(long price) {
	this.price = price;
}
public mobile(int id, int model, String name, long price) {
	this.id = id;
	this.model = model;
	this.name = name;
	this.price = price;
}
public mobile() {
	super();
	// TODO Auto-generated constructor stub
}


}
