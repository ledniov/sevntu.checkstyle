package com.github.sevntu.checkstyle.checks.coding.singularfield;

class InputSingularField9
{
	private Person person = new Person(); // ok, setting value from constructor
	
	public InputSingularField9(String name) {
		person.setName(name);
	}
}

class Person
{
	private String name;

	public Person() {
		
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}