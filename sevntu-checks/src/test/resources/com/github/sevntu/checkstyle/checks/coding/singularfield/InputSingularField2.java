package com.github.sevntu.checkstyle.checks.coding.singularfield;

import java.util.Random;

class InputSingularField2
{
	private Random rnd; // ok, no warning here, variable is in use
	 
	public InputSingularField2() {
		rnd = new Random();
	}
 
	public int randomHour() {
		return rnd.nextInt(23);
	}	
 
	public int rndMinute() {
		return rnd.nextInt(59);
	}
}