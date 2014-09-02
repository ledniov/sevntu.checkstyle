package com.github.sevntu.checkstyle.checks.coding;

import static com.github.sevntu.checkstyle.checks.coding.SingularFieldCheck.MSG_KEY;

import org.junit.Test;

import com.github.sevntu.checkstyle.BaseCheckTestSupport;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;

public class SingularFieldCheckTest extends BaseCheckTestSupport
{
	private final DefaultConfiguration checkConfig = createCheckConfig(SingularFieldCheck.class);
	
    /**
     * An error message for current check.
     */
    private final String warningMessage = getCheckMessage(MSG_KEY);
	
	@Test
	public void warnForClassAndInnerClassVariables() throws Exception
	{
        final String[] expected = {
        		"5: " + warningMessage,
        		"9: " + warningMessage,
        	};
        
        verify(checkConfig, getPath("singularfield/InputSingularField.java"), expected);
	}
	
	@Test
	public void dontCatchSimpleDataContainer() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField1.java"), expected);
	}
	
	@Test
	public void dontCatchVariableInUse() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField2.java"), expected);
	}
	
	@Test
	public void dontCatchConstantsPublicsAndCaching() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField3.java"), expected);
	}
	
	@Test
	public void warnForVarUsedOnlyInIf() throws Exception
	{
        final String[] expected = {
        		"5: " + warningMessage,
        	};
        
		verify(checkConfig, getPath("singularfield/InputSingularField4.java"), expected);
	}
	
	@Test
	public void warnForObjectUsedTwiceAndCreatedLocallyInMethod() throws Exception
	{
        final String[] expected = {
        		"10: " + warningMessage,
        	};
        
		verify(checkConfig, getPath("singularfield/InputSingularField5.java"), expected);
	}
	
	@Test
	public void dontCatchSyncObject() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField6.java"), expected);
	}
	
	@Test
	public void dontCatchControlFlow() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField7.java"), expected);
	}
	
	@Test
	public void dontCatchVariableUsedInOuterVariable() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField8.java"), expected);
	}

	@Test
	public void testDontCatchForValueUsedInConstructorForSetter() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField9.java"), expected);
	}
	
	
}