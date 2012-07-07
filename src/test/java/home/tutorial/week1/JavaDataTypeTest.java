package home.tutorial.week1;

import junit.framework.Assert;

import org.junit.Test;

public class JavaDataTypeTest 
{
	@Test
	public void verifyReturnInputByte()
	{
		byte input = 100;
		byte expected = 100;
		
		JavaDataType uut = new JavaDataType();
		Assert.assertEquals(expected, uut.returnInputByte(input));
	}
	
	@Test
	public void verifyReturnInputByteFails()
	{
		byte input = 100;
		byte expected = 101;
		
		JavaDataType uut = new JavaDataType();
		
		Assert.assertNotSame(expected, uut.returnInputByte(input));
	}
	
	@Test
	public void verifyReturnInputShort()
	{
		short input = 10000;
		short expected = 10000;
		JavaDataType uut = new JavaDataType();
		
		Assert.assertEquals(expected, uut.returnInputShort(input));
	}
	
	@Test
	public void verifyReturnInputShortFails()
	{
		short input = 10000;
		short expected = 10001;
		JavaDataType uut = new JavaDataType();
		
		Assert.assertNotSame(expected, uut.returnInputShort(input));
	}
	
	@Test
	public void verifyAddInt()
	{
		int firstValue = 8;
		int secondValue = 4;
		int expected = 12;
		JavaDataType uut = new JavaDataType();
		
		Assert.assertEquals(expected, uut.addInt(firstValue, secondValue));
	}
}

