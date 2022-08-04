package com.bip;

public class ToStringTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		employee.name = "XYZ";
		
		Employee employee1 = new Employee();
		employee1.name = "XYZ";
		System.out.println(employee);
		System.out.println(employee1);
		
		if(employee.equals(employee1)) {
			System.out.println("Same");
		} else {
			System.out.println("Not Same");
		}
	}
}

class Employee {
	String name;
	
	@Override
	public String toString() {
		return name;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		Employee emp = (Employee) obj;
		return emp.name.equals(this.name);
	}
}
