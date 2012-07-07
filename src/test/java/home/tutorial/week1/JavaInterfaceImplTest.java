package home.tutorial.week1;

import junit.framework.Assert;

import org.junit.Test;

public class JavaInterfaceImplTest 
{
	
	@Test
	public void verifyAddInt()
	{
		int firstValue = 8;
		int secondValue = 4;
		
		int expected = 12;
		
		JavaInterface uut = new JavaInterfaceImpl();
		Assert.assertEquals(expected, uut.addInt(firstValue, secondValue));
		
	}
	
	@Test
	public void verifySubtractFloat()
	{
		float firstValue = 1.5f;
		float secondValue = 1.5f;
		
		float expected = 0.0f;
		JavaInterface uut = new JavaInterfaceImpl();
		Assert.assertEquals(expected, uut.substractFloat(firstValue, secondValue));
	}

	@Test
	public void verifyMultiplyDouble()
	{
		double firstValue = 1.1d;
		double secondValue = 1.1d;
		
		double expected = 1.2100000000000002d;
		JavaInterface uut = new JavaInterfaceImpl();
		Assert.assertEquals(expected, uut.multiplyDouble(firstValue, secondValue));
	}
	
	@Test
	public void verifyconcatString()
	{
		String firstValue = "Hey";
		String secondValue = "Sonu";
		
		String expected = "HeySonu";
		JavaInterface uut = new JavaInterfaceImpl();
		Assert.assertEquals(expected, uut.concatString(firstValue, secondValue));
	}
	
	@Test
	public void verifyAddLong()
	{
		long firstValue = 0L;
		long secondValue = 2L;
		
		long expected = 2L;
		
		JavaInterface uut = new JavaInterfaceImpl();
		Assert.assertEquals(expected, uut.addLong(firstValue, secondValue));
	}
}


