
class InputConvertFieldToLocalVariable10 extends Object
{
	private Map map = new SomeMap(); // ok, used twice
 
 	private boolean bar(Object o) {
		if(super.isTrue) {
			if(map.get(o) != null) {
				return false;
			} 
 
			map.put(o,o); 
		} 
 
		return true;
	}
}