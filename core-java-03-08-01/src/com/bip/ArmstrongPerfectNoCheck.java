package com.bip;

import java.util.Scanner;

public class ArmstrongPerfectNoCheck {

	public static void main(String[] args) {
	int a,b,c,n,m, count = 0,sum = 0;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a number : ");
	n = sc.nextInt();
	a = n;
	c = n;
	while(a>0) {
		a = a/10;
		count++;
	}
	while(n>0) {
		b = n % 10;
		sum = (int)(sum+Math.pow(b, count));
		n = n/10;
	}
	if(sum==c) {
		System.out.println("Given number is armStrong");
	}else {
		System.out.println("Given number isn'nt armStrong");
	}
	for(int i =1;i<n;i++) {
		if(n % i == 0) {
			sum = sum + i;
		}
	}
	if(sum==n) {
		System.out.println("Given number is perfect");
	}else {
		System.out.println("Given number isn'nt perfect");
	}
	
	

	}

}
