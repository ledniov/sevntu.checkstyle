
class InputConvertFieldToLocalVariable4
{
	private Random rnd; // ok, no warning here, variable is in use
	 
	public InputConvertFieldToLocalVariable4() {
		rnd = new Random();
	}
 
	public int randomHour() {
		return rnd.nextInt(23);
	}	
 
	public int rndMinute() {
		return rnd.nextInt(59);
	}
}