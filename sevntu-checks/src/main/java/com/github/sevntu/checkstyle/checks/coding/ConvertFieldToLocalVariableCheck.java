package com.github.sevntu.checkstyle.checks.coding;

import com.puppycrawl.tools.checkstyle.api.Check;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

public class ConvertFieldToLocalVariableCheck extends Check
{
	/**
	 * The key is pointing to the message text String in
	 * "messages.properties file".This message used for common cases.
	 */
	public static final String MSG_KEY = "convert.field.to.local.variable";
	
	
	@Override
	public int[] getDefaultTokens() {
		return new int [] { TokenTypes.VARIABLE_DEF };
	}

}