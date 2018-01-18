/**
 * 
 */
package com.aicalculator.base;

/**
 * @author bhanu
 *
 */
public class BaseCalculator implements ICalculator {

	@Override
	public int addTwoNumbers(int a, int b) {
		// adds two numbers of type integer and returns
		return a + b;
	}

	@Override
	public int subtractTwoNumbers(int a, int b) {
		// Subtracts two numbers of type integer and returns
		return a - b;
	}

	@Override
	public float divideTwoNumbers(int a, int b) throws ArithmeticException {
		// divides two numbers of type integer and returns a float
		if (b == 0) {
			throw new ArithmeticException("Divisor cannot be '0' buddy!");
		}
		return a / b;
	}

	@Override
	public double multiplyTwoNumbers(int a, int b) {
		// multiplies two numbers of type integer and returns a double
		return a * b;
	}

}
