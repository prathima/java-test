package home.tutorial.week1;

public interface JavaOperatorsInterface 
{
	/**
	 * Returns input value incremented by 1 using the unary operator ++
	 * @param input
	 */
	int unaryAdditionOperator(int input);
	
	/**
	 * Multiply first and second value
	 * 
	 * @param firstValue
	 * @param secondValue
	 * @return
	 */
	int binaryMultiplicationOperator(float firstValue, float secondValue);
	
	/**
	 * If check value == firstValue, return firstValue
	 * else return secondValue
	 * 
	 * @param checkValue
	 * @param firstValue
	 * @param secondValue
	 * @return value
	 */
	int ternaryOperator(int checkValue, int firstValue, int secondValue);
	
	/**
	 * input is greater than 0 or input is less than zero
	 * @param input
	 * @return
	 */
	boolean logicalOperatorCheckRealNumber(int input);
	
	
}
