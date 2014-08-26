
class InputConvertFieldToLocalVariable15
{
	private Person person = new Person(); // ok, setting value from constructor
	
	public Example18(String name) {
		person.setName(name);
	}
}