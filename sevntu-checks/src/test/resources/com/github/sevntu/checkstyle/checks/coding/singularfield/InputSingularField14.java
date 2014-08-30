package com.github.sevntu.checkstyle.checks.coding.singularfield;

class InputConvertFieldToLocalVariable14
{
	private int x; // ok, used to accumulate result
	public int y; // ok, skip public
	
	public int foo(int y) {
		x = x + y;
		return x;
	}
    
    int bar(int z) {
        y = z + 5;
        return y;
    }
    
}