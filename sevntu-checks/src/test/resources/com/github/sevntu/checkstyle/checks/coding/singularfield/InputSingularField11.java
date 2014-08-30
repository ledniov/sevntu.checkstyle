package com.github.sevntu.checkstyle.checks.coding.singularfield;

class InputConvertFieldToLocalVariable11
{
	private final Object lock = new Object(); // ok, used as sync object
 
	public void foo() {
		synchronized (lock) {
			bar();
		}
	}
 
	public void bar() {
		//
	}
}