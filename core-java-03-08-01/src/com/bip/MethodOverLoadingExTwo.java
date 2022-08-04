package com.bip;

public class MethodOverLoadingExTwo {
	private static void display(int a) {
		System.out.println("Value of a is " + a);
	}
	private static void display(int a,int b) {
		System.out.println(" Value of " + a + " and " + b);
	}
	public static void main(String[] args) {
		display(6);
		display(9,10);
	}

}
