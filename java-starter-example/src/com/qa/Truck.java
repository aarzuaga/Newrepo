package com.qa;

public class Truck extends Vehicles {
	public String fuleType;
	boolean offRoad = true;
	public int size;

	public Truck(int year, String name, String color, double price) {
		super(year, name, color, price);
		System.out.println();

	}

	@Override
	public void start() {
		System.out.println("truck is running");

	}

	@Override
	public void accelerate() {
		System.out.println("gears shift to D");

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
