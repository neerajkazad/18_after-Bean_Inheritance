package com.bi.beans;

public class Bus {
	private int id;
	private String model;
	private String manufecture;
	private String color;
	
	private int capacity;

	public void setId(int id) {
		this.id = id;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public void setManufecture(String manufecture) {
		this.manufecture = manufecture;
	}

	public void setColor(String color) {
		this.color = color;
	}

	
	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	@Override
	public String toString() {
		return "Bus [id=" + id + ", model=" + model + ", manufecture=" + manufecture + ", color=" + color
				+ ", capacity=" + capacity + "]";
	}

	

}
