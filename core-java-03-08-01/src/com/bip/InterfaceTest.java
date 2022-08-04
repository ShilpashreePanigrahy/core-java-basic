package com.bip;

	interface inf {
		public int x = 2;
		abstract void show();
	}
	abstract class TestClass implements inf{
		public void show() {
			System.out.println("shilpa");
		}
	public static void main(String[] args) {
		TestClass t = new TestClas();
		t.show();
		System.out.println(x);
	}

}
