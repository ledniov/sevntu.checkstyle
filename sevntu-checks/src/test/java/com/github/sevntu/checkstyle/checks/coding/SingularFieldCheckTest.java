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
	public void testWarningForClassField() throws Exception
	{
        final String[] expected = {
        		"11: " + warningMessage,
        		"17: " + warningMessage,
        	};
        
        verify(checkConfig, getPath("singularfield/InputSingularField.java"), expected);
	}
	
	@Test
	public void testDontCatchInstanceVariableHiding() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField2.java"), expected);
	}
	
	@Test
	public void testDontCatchGetSet() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField3.java"), expected);
	}
	
	@Test
	public void testDontCatchForUsedVariable() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField4.java"), expected);
	}
	
	@Test
	public void testDontCatchForConstantsAndLazyInstantiations() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField5.java"), expected);
	}
	
	@Test
	public void testDontCatchForDefaultValue() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField6.java"), expected);
	}
	
	@Test
	public void testDontCatchForGetSetWithThisKeyword() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField7.java"), expected);
	}
	
	@Test
	public void testDontCatchPublicVariables() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField8.java"), expected);
	}
	
	@Test
	public void testDontCatchForSelfInstantiation() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField9.java"), expected);
	}

	@Test
	public void testDontCatchForTwiceUsedVariable() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField10.java"), expected);
	}
	
	@Test
	public void testDontCatchSyncObject() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField11.java"), expected);
	}
	
	@Test
	public void testDontCatchControlFlowVariable() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField12.java"), expected);
	}

	@Test
	public void testDontCatchPrivateVarUsedInOuterClass() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField13.java"), expected);
	}
	
	@Test
	public void testDontCatchResultAccumulationVariable() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField14.java"), expected);
	}
	
	@Test
	public void testDontCatchForValueUsedInConstructorForSetter() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("singularfield/InputSingularField15.java"), expected);
	}
	
	
}