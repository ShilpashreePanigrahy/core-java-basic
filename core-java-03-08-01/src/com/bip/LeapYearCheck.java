package com.bip;

import java.util.Scanner;

public class LeapYearCheck {

	public static void main(String[] args) {
	int b;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a year: ");
	b = s.nextInt();
	if(b%400==0) {
		System.out.println(b+ " Given year is a leap year ");
	}else {
		System.out.println(b+ " Given year isn't a leap year ");
	}

	}

}
