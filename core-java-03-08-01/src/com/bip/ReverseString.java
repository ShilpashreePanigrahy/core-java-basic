package com.bip;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		String name, st = "";
		Scanner s = new Scanner(System.in);
		System.out.println("Enter any char : ");
		name = s.next();
		int length = name.length();
		for(int i= length-1;i>=0;i--) {
			st = st+name.charAt(i);
			
		}
		System.out.println("After reverse : " + st);

	}

}
