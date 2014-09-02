package com.github.sevntu.checkstyle.checks.coding.singularfield;

class InputSingularField3
{
	private static final String FOO = "foo"; // ok, private constant
	public static final String BAR = "bar"; // ok, public is ignored
 
	private Object test; // ok, created by lazy initialization on first getter call
	private BlaBlaManager manager; // ok, created in c-tor (caching first class instantiation)
 
	public InputSingularField3() {
		manager = BlaFactory.getBlaBlaManager();
	}
 
	public Object someMethod() {
		return manager.create(FOO);
	}
	
	public Object lazyTest() {
		if(test == null) {
			test = new Object();
		}
		
		return test;
	}
	
}

class BlaBlaManager
{
	public Object create(String value)
	{
		return new Object();
	}
}

class BlaFactory
{
	public static BlaBlaManager getBlaBlaManager()
	{
		return new BlaBlaManager();
	}
}