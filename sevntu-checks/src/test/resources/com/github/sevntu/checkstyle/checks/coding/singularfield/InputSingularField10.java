package com.github.sevntu.checkstyle.checks.coding.singularfield;

class InputConvertFieldToLocalVariable10 extends Object
{
	private Map<Object, Object> okMap = new HashMap<Object, Object>(); // ok, used twice
	private Map<Object, Object> warnMap; 
	
 	private boolean okMethod(Object o) {
		if(super.equals(o)) {
			if(okMap.get(o) != null) {
				return false;
			} 
 
			okMap.put(o,o); 
		} 
 
		return true;
	}
 	
 	private boolean warnMethod(Object o) {
		if(super.equals(o)) {
			warnMap = getSomeMap();
			if(warnMap.get(o) != null) {
				return false;
			} 
 
			warnMap.put(o,o); 
		} 
 
		return true;
 		
 	}

 	private Map<Object, Object> getSomeMap() {
 		Map<Object, Object> someData = new HashMap<Object, Object>();
 		// extracting data from different places
 		return someData;
 	}
 	
}