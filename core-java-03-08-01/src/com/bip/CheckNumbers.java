package com.bip;

import java.util.Scanner;

public class CheckNumbers {

	public static void main(String[] args) {
		int i,m,n = 0,prm = 0;
		Scanner a = new Scanner(System.in);
		System.out.println("Enter a number : ");
		i = a.nextInt();
		for(m = 2; m < n; m ++) {
			if(n%m == 0) {
				prm = 0;
				break;
			}else {
				prm = 1;
			}
		}
		if(prm == 0) {
			System.out.println("It is a prime number");
		}else {
			System.out.println("It isn'nt a prime number");
		}
		if(i%2 == 0) {
			System.out.println("It is a even number");
		}else {
			System.out.println("It is a odd number");
		}

	}

}
