package com.faiz.spring.shoppingbackends.dto;

public class Category {
private int id;
private String name;
private String dscription;
private String imageURL;
private boolean active=true;
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getDscription() {
	return dscription;
}
public void setDscription(String dscription) {
	this.dscription = dscription;
}
public String getImageURL() {
	return imageURL;
}
public void setImageURL(String imageURL) {
	this.imageURL = imageURL;
}
public boolean isActive() {
	return active;
}
public void setActive(boolean active) {
	this.active = active;
}
@Override
public String toString() {
	return "Category [id=" + id + ", name=" + name + ", dscription=" + dscription + ", imageURL=" + imageURL
			+ ", active=" + active + "]";
}
	
	
	
	
}
