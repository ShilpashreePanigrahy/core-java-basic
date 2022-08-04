package com.bip;

import java.util.Scanner;

public class ConvertDays {

	public static void main(String[] args) {
		int a, year, w, d;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter days: ");
		a = s.nextInt();
		year = a / 365;
		a = a % 365;
		System.out.println("year : " + year);
		w = a / 7;
		a = a % 7;
		System.out.println("week : " + w);
		d = a;
		System.out.println("Days : " + d);

		s.close();
	}

}
