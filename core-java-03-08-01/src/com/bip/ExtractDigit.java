package com.bip;

import java.util.Scanner;

public class ExtractDigit {

	public static void main(String[] args) {
		int a,b, i = 0;
		String z = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a year: ");
		a = s.nextInt();
		while(i<2) {
			b = a % 10;
			z = b +""+z;
			a = a/10;
			i++;
		}
		System.out.println("Last two digit of year : "+ z);
	}

}
