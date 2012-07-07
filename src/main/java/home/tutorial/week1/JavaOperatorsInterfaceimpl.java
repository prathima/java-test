package home.tutorial.week1;

public class JavaOperatorsInterfaceimpl implements JavaOperatorsInterface 
{
	@Override
	public int unaryAdditionOperator(int input)
	{
		return  input++;
	}

	@Override
	public int binaryMultipicationOperator(float firstValue, float secondValue)
	{
		return firstValue * secondValue;
	}
	
	@Override
	public int ternaryOperator(int checkValue, int firstValue, int secondValue)
	{
		 if (checkValue == firstValue)
			{
				return firstValue;
			}
		 else
		 	{
			 	return secondValue;
		 	}
	}
	
	
	@Override
	public 	boolean logicalOperatorCheckRealNumber(int input)
	{
		return input = (input>0) || (input<0);
	}


}
