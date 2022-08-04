package com.bip;

import java.util.Scanner;

public class IntergerConversion {

	public static void main(String[] args) {
		int a;
		byte b;
		char c;
		float d;
		Scanner f = new Scanner(System.in);
		System.out.println("Enter a integer : ");
		a = f.nextInt();
		b = (byte) a;
		System.out.println("After conversion into byte : " + b);
		c = (char) a;
		System.out.println("After conversion into char : " + c);
		d = (float) a;
		System.out.println("After conversion into float : " + d);

	}

}
