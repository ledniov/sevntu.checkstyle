package com.github.sevntu.checkstyle.checks.coding.singularfield;

class InputSingularField7
{
	private boolean bar = false; // ok, used to control flow
	
	public void foo() {
		if(!bar) {
			doSomething();
			bar = true;
		}
	}
	
	public void doSomething() {
		for (int i = 0; i < 10; i++) {
			// does something
		}
	}
}