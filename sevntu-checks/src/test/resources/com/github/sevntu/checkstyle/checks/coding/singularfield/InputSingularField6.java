package com.github.sevntu.checkstyle.checks.coding.singularfield;

class InputConvertFieldToLocalVariable6
{
	private int x; // ok, used as default value
	 
	int bar(int y) {
		if (y == 5) {
			x = y + 5; 
		}
 
		return x;
	}
 
}