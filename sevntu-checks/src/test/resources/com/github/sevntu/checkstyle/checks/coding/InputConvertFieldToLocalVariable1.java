
public class InputConvertFieldToLocalVariable1
{

	private class InnerClass
	{
		private int x; // warn
		
		public int foo(int y) {
			x = y * 4;
			return x;
		}
	}
	
}