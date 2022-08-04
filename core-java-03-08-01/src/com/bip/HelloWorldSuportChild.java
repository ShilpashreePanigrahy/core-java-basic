package com.bip;

public class HelloWorldSuportChild extends HelloWorldSuportParent{
	
	{
		System.out.println("Instance -: HWC");
	}
	HelloWorldSuportChild () {
		System.out.println(super.x);
		System.out.println(this.getClass().getName() + "()");
	}
	
	static {
		System.out.println("Static Child - HWC");
	}
}
