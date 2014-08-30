package com.github.sevntu.checkstyle.checks.coding.singularfield;

class InputConvertFieldToLocalVariable12
{
	private boolean bar = false; // ok, used to control flow
	
	public void foo() {
		if(!bar) {
			doSomething();
			bar = true;
		}
	}
}