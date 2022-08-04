package com.bip;

import java.util.Scanner;

public class UsingConditionalOperator {

	public static void main(String[] args) {
		int a,b;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number : ");
		a = s.nextInt();
		b = s.nextInt();
		if(a>b) {
			System.out.println(a + " is greatest number");
		}else {
			System.out.println(b + " is greatest number");
		}
	}

}
