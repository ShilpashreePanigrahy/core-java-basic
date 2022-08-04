package com.bip;

import java.util.Scanner;

public class ReverseNum {

	public static void main(String[] args) {
	int num = 0, rev = 0;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter any number: ");
	num = s.nextInt();
	while(num != 0) {
		rev = rev*10;
		rev = rev + num % 10;
		num = num / 10;
	}
	System.out.println("Reverse number is " + rev);
	}

}
