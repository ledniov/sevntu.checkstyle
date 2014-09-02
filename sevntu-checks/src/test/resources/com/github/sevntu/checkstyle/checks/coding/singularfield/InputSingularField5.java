package com.github.sevntu.checkstyle.checks.coding.singularfield;

import java.util.Map;
import java.util.HashMap;

class InputSingularField5 extends Object
{
	private Map<Object, Object> okMap = new HashMap<Object, Object>(); // ok, used twice
	private Map<Object, Object> okMap2; // ok, used twice (same as above but created in c-tor)
	private Map<Object, Object> warnMap; // warning here, can be replaced with local variable

	InputSingularField5() {
		okMap2 = new HashMap<Object, Object>();
	}
	
 	private boolean okMethod(Object o) {
		if(super.equals(o)) {
			if(okMap.get(o) != null) {
				return false;
			} 
 
			okMap.put(o,o); 
		} 
 
		return true;
	}
 
 	private boolean okMethod2(Object o) {
		if(super.equals(o)) {
			if(okMap2.get(o) != null) {
				return false;
			} 
 
			okMap2.put(o,o); 
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