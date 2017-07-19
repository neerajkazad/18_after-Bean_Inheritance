package com.bi.beans;

import java.beans.ConstructorProperties;

public class Car {
	private int id;
	private String model;
	private String manufecture;
	private String color;
	private String fuelType;

	//Case1: For Setter Injection
	/*public void setId(int id) {
		System.out.println("Id: "+id);
		this.id = id;
	}

	public void setModel(String model) {
		System.out.println("Model: "+model);
		this.model = model;
	}

	public void setManufecture(String manufecture) {
		this.manufecture = manufecture;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}*/
	
	//Case2: For Constructor Injection
	
	@ConstructorProperties({"id","model","manufecture","color","fuelType"})
	public Car(int id, String model, String manufecture, String color, String fuelType) {
		super();
		this.id = id;
		this.model = model;
		this.manufecture = manufecture;
		this.color = color;
		this.fuelType = fuelType;
	}
	
	@Override
	public String toString() {
		return "Car [id=" + id + ", model=" + model + ", manufecture=" + manufecture + ", color=" + color
				+ ", fuelType=" + fuelType + "]";
	}


	
}
