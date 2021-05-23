package com.qa;

import java.util.ArrayList;

public class Runner {

	public static void main(String[] args) {
		System.out.println("Start");

		Car car1 = new Car(2014, "Ford Focus", "silver", 3199);
		car1.setId(1);
		Car car2 = new Car(2018, "Jeep Compass", "black", 21236);
		car2.setId(2);

		Motorcycle moto1 = new Motorcycle(2011, "Yamaha ji-650", "white", 1575);
		moto1.setId(3);
		Motorcycle moto2 = new Motorcycle(2020, "Suzuki RJ1200", "pearl white", 13299);
		moto2.setId(4);

		Truck trk1 = new Truck(2018, "Dodge Ram 1500", "red", 32000);
		trk1.setId(5);
		Truck trk2 = new Truck(2002, "Ford F-150", "blue", 2700);
		trk2.setId(6);

		car1.run();
		System.out.println(' ');
//adding vehicles to garage list
		ArrayList<Vehicles> garage = new ArrayList<>();
		garage.add(car1);
		garage.add(car2);
		garage.add(moto1);
		garage.add(moto2);
		garage.add(trk1);
		garage.add(trk2);

		//System.out.println(car1.year);
		System.out.println("Model: " + car1.name);
		
		// System.out.println(garage.get(2));
		System.out.println(moto1.year + " " + moto1.name + " " + moto1.color + " " + moto1.price);
		
		for(int i=0; i < garage.size(); i++) {
			System.out.println(garage.get(i));
		}
		
		 String [][] garageArrays = { 
				 {"Ford Focus", "Jeep Compass"},
				 {"Yamaha ji-650", "Suzuki RJ1200"},
				 {"Dodge Ram 1500", "Ford F-150"}
		 };
		 
		 for (int row = 0; row < garageArrays.length; row++) {
			 
			 for(int column = 0; column < garageArrays[row].length; column++) {
				 
				 System.out.println(garageArrays[row][column]);
			 }
		 }
		
//removing vehicles from list
		//garage.remove(1);
		//System.out.println(garage.get(1));
		
		

		System.out.println("Finish");

	}

}
