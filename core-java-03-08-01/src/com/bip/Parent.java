package com.bip;

public class Parent {
	public void methodOne() {
		System.out.println("methodOne");
	}
	class child extends Parent{
		public void methodTwo() {
			System.out.println("methodTwo");
		}
	}
public static void main(String args[]) {
	Parent p = new Parent();
	p.methodOne();
	p.methodTwo();
}

}
