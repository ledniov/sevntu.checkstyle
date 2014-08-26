
class InputConvertFieldToLocalVariable2
{
	private int x; // should be warn, but not catched by this check 
	
	void setX(int x) {
		this.x = x;
	}
	
	int doX() {
		int x = 5; // instance variable hiding will be catched by another check
		return x * 3;
	}
}