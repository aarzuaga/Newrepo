package com.qa;

public abstract class Vehicles{
	
	//Attributes
	public int year;
	public String name;
	public String color;
	public double price;
	
	//Constructors
	public Vehicles(int year, String name, String color, double price) {
		this.year = year;
		this.name = name;
		this.color = color;
		this.price = price;
		
	}
	private int id;

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
		
	}
	//methods-drving-turn on, accelerate, brake, reverse, turn left or right, park 
	public abstract void start();
	public abstract void accelerate();
	public abstract void brake();
	public abstract void reverse();
	public abstract void turnLeft();
	public abstract void turnRight();
	public abstract void park();
	
	public void run() {
		start();
		accelerate();
		brake();
		reverse();
		turnLeft();
		turnRight();
		park();
	}
	
}
