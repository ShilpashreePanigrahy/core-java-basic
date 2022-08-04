package com.bip;

public class HelloWorld {
	
	public HelloWorld() {
		System.out.println(this.getClass().getName() + "()");
	}
	
	static {
		System.out.println("Hello World Static");
	}
	
	public static void main(String[] args) {
		System.out.println("main");
		
		HelloWorldSuportParent parent = new HelloWorldSuportChild();
		
		if(parent instanceof HelloWorldSuportChild) {
			System.out.println("Yes Done");
		} else {
			System.out.println("No");
		}
	}
}
