package com.github.sevntu.checkstyle.checks.coding.singularfield;

class InputSingularField4
{
	private int x; // warn, saves result and then returns it
	private Integer obj = new Integer(3); // ok, self-instantiation (performance optimization, if getTaxRate called a lot of times)
	private int sum; // ok, used to accumulate result
	public int y; // ok, skip public

	int bar(int y) {
		if (y == 5) {
			x = y + 5; 
		}
 
		return x;
	}
	
	public int foo(int y) {
		sum = sum + y;
		return sum;
	}
    
    int norf(int z) {
        y = z + 5;
        return y;
    }
	
	public Integer getTaxRate() {
		return obj + 10;
	}

}