
class InputConvertFieldToLocalVariable14
{
	private int x; // ok, used to accumulate result
	
	public int foo(int y) {
		x = x + y
		return x;
	}
}