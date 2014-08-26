
class InputConvertFieldToLocalVariable7
{
	private int x; // ok, for getter and setter using 'this' keyword
	
	void setX(int x) {
		this.x = x;
	}
 
	int getX() {
		return this.x;
	}
}