package com.github.sevntu.checkstyle.checks.coding.singularfield;

class InputConvertFieldToLocalVariable9
{
	private Integer x = new Integer(3); // ok, self-instantiation (performance optimization, if getTaxRate called a lot of times)
 
	public Integer getTaxRate() {
		return x + 10;
	}
}