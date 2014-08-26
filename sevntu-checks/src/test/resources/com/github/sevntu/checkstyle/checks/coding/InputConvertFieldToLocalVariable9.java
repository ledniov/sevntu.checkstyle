
class InputConvertFieldToLocalVariable9
{
	private Integer x = new Integer(3); // ok, self-instantiation (performance optimization, if getX called a lot of times)
 
	public Integer getX() {
		return x + 10;
	}
}