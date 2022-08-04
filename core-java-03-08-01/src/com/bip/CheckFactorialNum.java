package com.bip;

import java.util.Scanner;

public class CheckFactorialNum {

	public static void main(String[] args) {
	int num,i =1,fact = 1;
	Scanner s = new Scanner(System.in);
	System.out.println("Enter a number : ");
	num = s.nextInt();
			while(i <= num) {
				fact = fact*i;
				i++;
			}
			System.out.println("factorial of the number is " + fact);
	}

}
