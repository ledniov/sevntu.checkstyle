
public class InputConvertFieldToLocalVariable
{
	private int result; // warning here
	 
	public int someMethod(int firstArg, int secondArg) {
		result = firstArg + secondArg;
		// other manipulations with result
		return result;
	}
	
}