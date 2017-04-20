package com.peektech.web.ui;

public class Car {
	
	private int id;
	private String brand;
	private int year;
	private String color;
	private Long price;
	private boolean soldState;
	
	
	
	
	public Car(String randomId, String randomBrand, int randomYear, String randomColor, int randomPrice,
			boolean randomSoldState) {
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public Long getPrice() {
		return price;
	}
	public void setPrice(Long price) {
		this.price = price;
	}
	public boolean getSoldState() {
		return soldState;
	}
	public void setSoldState(boolean soldState) {
		this.soldState = soldState;
	}
	
	

}
