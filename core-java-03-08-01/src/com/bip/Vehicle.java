package com.bip;

public class Vehicle {
	void run() {
		System.out.println("Vehicle is running");
	}
	
	static void hideMe() {
		System.out.println("Hide in V is running");
	}

	public static void main(String[] args) {
		Vehicle x = new Vehicle();
		x.run();
		
		Vehicle bike = new Bike();
		bike.run();
		
		bike.hideMe();
	}
}


//Overhidding

class Bike extends Vehicle {
	void run() {
		System.out.println("bike is running safely");
	}
	
	static void hideMe() {
		System.out.println("Hide in B is running");
	}
}