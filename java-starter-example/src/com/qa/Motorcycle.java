package com.qa;

public class Motorcycle extends Vehicles {

	public int numbWheels;
	public int maxSpeed;
	boolean offRoad = true;
	boolean trackWorthy = false;

	public Motorcycle(int year, String name, String color, double price) {
		super(year, name, color, price);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("Motorcycle is running");

	}

	@Override
	public void accelerate() {
		System.out.println("engine rpm increases");

	}

	@Override
	public void brake() {
		System.out.println("brake pads clamp on rotor");

	}

	@Override
	public void reverse() {
		System.out.println("gears shift to R");

	}

	@Override
	public void turnLeft() {
		System.out.println("turning left");

	}

	@Override
	public void turnRight() {
		System.out.println("turning right");

	}

	@Override
	public void park() {
		System.out.println("gears shift to P");

	}

}
