package com.bip;

public class Test {
	public void methodOne(int i) {}
	public void methodOne(double d) {
	}
	public static void main(String args[]) {
		Test t = new Test();
		t.methodOne(20);
		t.methodOne(30.8);
	//System.out.println(t);
}
}
