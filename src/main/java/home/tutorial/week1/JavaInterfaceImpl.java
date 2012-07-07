package home.tutorial.week1;

public class JavaInterfaceImpl implements JavaInterface 
{

	@Override
	public int addInt(int firstValue, int secondValue) 
	{
		return firstValue + secondValue;
	}

	@Override
	public float substractFloat(float firstValue, float secondValue) 
	{
		return firstValue - secondValue;
	}
	
	@Override
	public double multiplyDouble(double firstValue, double secondValue)
	{
		return firstValue * secondValue;
	}
	
	@Override
	public String concatString(String firstValue, String secondValue)
	{
		return firstValue += secondValue;
	}


	@Override
	public long addLong(long firstValue, long secondValue) 
	{
		return firstValue + secondValue;
	}
	
	@Override
	public char concatChar(char firstValue, char secondValue)
	{
		return firstValue += secondValue;
	}
}
