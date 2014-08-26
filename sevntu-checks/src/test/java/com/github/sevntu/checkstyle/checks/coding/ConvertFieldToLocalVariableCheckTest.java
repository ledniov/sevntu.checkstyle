package com.github.sevntu.checkstyle.checks.coding;

import static com.github.sevntu.checkstyle.checks.coding.ConvertFieldToLocalVariableCheck.MSG_KEY;

import org.junit.Test;

import com.github.sevntu.checkstyle.BaseCheckTestSupport;
import com.puppycrawl.tools.checkstyle.DefaultConfiguration;

public class ConvertFieldToLocalVariableCheckTest extends BaseCheckTestSupport
{
	private final DefaultConfiguration checkConfig = createCheckConfig(ConvertFieldToLocalVariableCheck.class);
	
    /**
     * An error message for current check.
     */
    private final String warningMessage = getCheckMessage(MSG_KEY);
	
	@Test
	public void testWarningForClassField() throws Exception
	{
        final String[] expected = {
        		"11: " + warningMessage
        	};
        
        verify(checkConfig, getPath("InputConvertFieldToLocalVariable.java"), expected);
	}
	
	@Test
	public void testWarningForInnerClass() throws Exception
	{
        final String[] expected = {
        		"7: " + warningMessage
        	};
        
        verify(checkConfig, getPath("InputConvertFieldToLocalVariable1.java"), expected);
	}
	
	@Test
	public void testDontCatchInstanceVariableHiding() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable2.java"), expected);
	}
	
	@Test
	public void testDontCatchGetSet() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable3.java"), expected);
	}
	
	@Test
	public void testDontCatchForUsedVariable() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable4.java"), expected);
	}
	
	@Test
	public void testDontCatchForConstantsAndLazyInstantiations() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable5.java"), expected);
	}
	
	@Test
	public void testDontCatchForDefaultValue() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable6.java"), expected);
	}
	
	@Test
	public void testDontCatchForGetSetWithThisKeyword() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable7.java"), expected);
	}
	
	@Test
	public void testDontCatchPublicVariables() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable8.java"), expected);
	}
	
	@Test
	public void testDontCatchForSelfInstantiation() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable9.java"), expected);
	}

	@Test
	public void testDontCatchForTwiceUsedVariable() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable10.java"), expected);
	}
	
	@Test
	public void testDontCatchSyncObject() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable11.java"), expected);
	}
	
	@Test
	public void testDontCatchControlFlowVariable() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable12.java"), expected);
	}

	@Test
	public void testDontCatchPrivateVarUsedInOuterClass() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable13.java"), expected);
	}
	
	@Test
	public void testDontCatchResultAccumulationVariable() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable14.java"), expected);
	}
	
	@Test
	public void testDontCatchForValueUsedInConstructorForSetter() throws Exception
	{
		final String[] expected = {};
		verify(checkConfig, getPath("InputConvertFieldToLocalVariable15.java"), expected);
	}
	
	
}