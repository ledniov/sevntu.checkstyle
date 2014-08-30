package com.github.sevntu.checkstyle.checks.coding.singularfield;

public class InputConvertFieldToLocalVariable
{
	private int result; // warning here
	
	private class InnerClass
	{
		private int x; // warning for inner class
		
		public int foo(int y) {
			x = y * 4;
			return x;
		}
	}
	
	public int someMethod(int firstArg, int secondArg) {
		result = firstArg + secondArg;
		// other manipulations with result
		return result;
	}
	
}