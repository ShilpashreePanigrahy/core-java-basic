package com.bip;

public class Empolyee {
	String name;
	int age;

	public Empolyee(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		return this.name+"\t" +this.age;
	}
	
	public static void main(String[] args) {
		Empolyee emp1 = new Empolyee(" Shilpa ", 27);
		Empolyee emp2 = new Empolyee(" Anu ", 26);
		Empolyee emp3 = new Empolyee(" Bhagya ", 28);
		System.out.println(emp1);
		System.out.println(emp2);
		System.out.println(emp3);
	}
}
