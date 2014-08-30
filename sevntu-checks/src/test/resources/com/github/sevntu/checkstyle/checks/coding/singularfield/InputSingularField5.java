package com.github.sevntu.checkstyle.checks.coding.singularfield;

class InputConvertFieldToLocalVariable5
{
	private static final String FOO = "foo"; // ok, private constant
	public static final String BAR = "bar"; // ok, public is ignored
 
	private Object test; // ok, created by lazy initialization on first getter call
	private Bla manager; // ok, created in c-tor (caching first class instantiation)
 
	public InputConvertFieldToLocalVariable5() {
		manager = BlaFactory.getBlaBlaManager();
	}
 
	public void someMethod() {
		return manager.create(FOO);
	}
	
	public Object lazyTest() {
		if(test == null) {
			test = new Object();
		}
		
		return test;
	}
	
}