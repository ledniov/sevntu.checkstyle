package com.github.sevntu.checkstyle.checks.coding;

import com.puppycrawl.tools.checkstyle.api.Check;
import com.puppycrawl.tools.checkstyle.api.TokenTypes;

public class SingularFieldCheck extends Check
{
	/**
	 * The key is pointing to the message text String in
	 * "messages.properties file". This message used for common cases.
	 */
	public static final String MSG_KEY = "singular.field";
	
	
	@Override
	public int[] getDefaultTokens() {
		return new int [] { TokenTypes.VARIABLE_DEF };
	}

}