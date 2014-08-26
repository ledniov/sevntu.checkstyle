
class InputConvertFieldToLocalVariable13
{
	private class Bar {
		private int bar; // ok, used in outer class
	
		private Bar(int barry) {
			bar = barry;
		}
	}
	
	public int foo() {
		Bar bart = new Bar(5);
		return bart.bar;
	}
}