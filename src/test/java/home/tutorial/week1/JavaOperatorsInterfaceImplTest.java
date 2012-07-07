package home.tutorial.week1;

import junit.framework.Assert;

import org.junit.Test;

public class JavaOperatorsInterfaceImplTest {
	
	@Test
	public void verifyunaryAdditionOperator()
	{
		int input = 0;
		input++;
		int expected = 1;
		
		JavaOperatorsInterface uut = new JavaOperatorsInterfaceImpl();
		Assert.assertEquals(expected, uut.unaryAdditionOperator(input));
	}
	
	
	@Test
	public void verifybinaryMultipicationOperator()
	{
		float firstValue = 00100101;
		float secondValue = 00010001;
		
		float expected = 0010100;
		
		JavaOperatorsInterface uut new JavaOperatorsInterfaceImpl();
		Assert.assertEquals(expected, uut.binaryMultiplicationOperator(firstValue, secondValue));
	}

	@Test
	public void verifyternaryOperatoe()
	{
		int firstValue = 1;
		int secondValue = -1;
		int checkValue = -1;
		
		if(checkValue == firstValue)
		{
			System.out.println("expected is:"  +firstValue);
		}
		else
		{
			System.out.println("expected is:" +secondValue);
		}
		
	}
}
