package com.bip;

import java.util.Scanner;

public class SumAvgCheck {

	public static void main(String[] args) {
		int a,numbers = 0,sum = 0;
		double avg;
		{
			System.out.println("Enter any five numbers: ");
		}
		
		for(a=0;a<5;a++) {
			Scanner s = new Scanner(System.in);
			numbers = s.nextInt();
			sum+=numbers;
		}
		System.out.println( "The sum is : " + sum);
		avg = sum/5;
		System.out.println( "The average is : " + avg);
	}
}
