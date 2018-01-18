/**
 * 
 */
package com.aicalculator.base;

/**
 * @author bonzojava
 *
 */
public interface ICalculator {

	public int addTwoNumbers(int a, int b);

	public int subtractTwoNumbers(int a, int b);

	public float divideTwoNumbers(int a, int b) throws ArithmeticException;

	public double multiplyTwoNumbers(int a, int b);

}
