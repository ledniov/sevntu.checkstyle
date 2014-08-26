
class InputConvertFieldToLocalVariable3
{
	private int x; // ok, no warning here, used for getter and setter
 
	private void setX(int x) {
		this.x = x;
	}
 
	public int getX() {
		return x;
	}
}