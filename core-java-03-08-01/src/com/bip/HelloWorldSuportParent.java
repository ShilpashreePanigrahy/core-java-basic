package com.bip;

public class HelloWorldSuportParent {
	
	int x = 10;
	
	{
		System.out.println("Instance -: HWP");
	}
	
	HelloWorldSuportParent() {
		System.out.println("Parent" + "()");
	}
	static {
		System.out.println("PArent - HWC");
	}
}
