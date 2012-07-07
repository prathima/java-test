package home.tutorial.week1;

public interface JavaInterface 
{
	/**
	 * Return sum of first and second value.
	 * @param firstValue
	 * @param secondValue
	 * @return sum
	 */
	int addInt(int firstValue, int secondValue);

	/**
	 * Returns first minus second value.
	 * @param firstValue
	 * @param secondValue
	 * @return sub
	 */
	float substractFloat(float firstValue, float secondValue);
	
	/**
	 * Returns first multiply second value.
	 * @param firstValue
	 * @param secondValue
	 * @return multiply
	 */
	
	double multiplyDouble(double firstValue, double secondvalue);
	
	/**
	 * Returns first concat second value.
	 * @param firstValue
	 * @param secondValue
	 * @return concat
	 */
	String concatString(String firstValue, String secondValue);
	
	/**
	 * Return sum of first and second value.
	 * @param firstValue
	 * @param secondValue
	 * @return sum
	 */
	long addLong(long firstValue, long secondValue);
		
	/**
	 * Returns first concat second value.
	 * @param firstValue
	 * @param secondValue
	 * @return concat
	 */
	char concatChar(char firstValue, char secondValue);

}

