package com.bip;

public class Animal {
	public void display() {
		System.out.println("I am a animal");
	}

	public static void main(String[] args) {
		Animal d = new Animal();
		d.display();
	}
}

class dog extends Animal {
	public void display() {
		System.out.println("I am a dog");
	}
}
