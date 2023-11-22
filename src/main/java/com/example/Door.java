package com.example;

import java.sql.Date;
import java.time.LocalDate;

public class Door {
private int id;
private String material;
private double height;
private double width;
private Date date;




public Door(int id, String material, double height, double width,Date date) {
    this.id = id;
    this.material=material;
    this.height=height;
    this.width=width;
    this.date=date;
}




public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getMaterial() {
	return material;
}
public void setMaterial(String material) {
	this.material = material;
}
public double getHeight() {
	return height;
}
public void setHeight(double height) {
	this.height = height;
}
public double getWidth() {
	return width;
}
public void setWidth(double width) {
	this.width = width;
}
public Date getDate() {
	return date;
}
public void setDate(Date date) {
	this.date = date;
}

}