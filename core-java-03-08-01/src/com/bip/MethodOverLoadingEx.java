package com.bip;

public class MethodOverLoadingEx {
	public static void add(int i , int j) {
		System.out.println("Total of " + i + " and " + j);
	}
	public static void add (int i) {
		System.out.println("Value of " + i);
	}
	public static void main(String[] args) {
		add(3,4);
		add(5);
	}

}
