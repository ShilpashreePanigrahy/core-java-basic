package com.bip;

abstract class CheckFinalClass {
	public final void methodOne() {}
}
class child extends CheckFinalClass{
	public void methodOne() {
	}
}
