package com.aicalculator.base;

import com.aicalculator.datatransfer.FileOperator;
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// variable declaration
		int a, b;
		boolean cont = true;

		System.out.println("Welcome to AI Calculator");
		System.out.println("I am an Intelligent Assistant Calculator and can assign any name that you want");
		System.out.println("What would you like to call me?");
		Scanner S = new Scanner(System.in); // invoke Scanner object
		String assistantName = S.nextLine().toString();

		if (!(assistantName == "")) {
			FileOperator file_operator = new FileOperator();
			try {
				file_operator.writeToFile("C:/aicalculator/name.txt", false, assistantName);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Wonderful! from now on I will be called as '" + assistantName + "'");
		}

		while (cont != false) {
			System.out.println("choose an operation you want to perform? 1. Add 2. Subtract 3. Divide 4. Multiply");
			int operation = S.nextInt();
			Calculator calc = new Calculator();
			System.out.println("Enter the first Number:");
			while (!S.hasNext()) {
				System.out.println("Enter a valid Integer");
			}
			a = S.nextInt();

			switch (operation) {
			case 1:
				System.out.println("Enter the second Number:");
				while (!S.hasNext()) {
					System.out.println("Enter a valid Integer");
				}
				b = S.nextInt();
				int sum = calc.addTwoNumbers(a, b);
				System.out.println("Sum of " + a + " and " + b + " is:" + sum);
				break;

			case 2:
				System.out.println("Enter the second Number:");
				while (!S.hasNext()) {
					System.out.println("Enter a valid Integer");
				}
				b = S.nextInt();
				int diff = calc.subtractTwoNumbers(a, b);
				System.out.println("Difference of " + a + " and " + b + " is:" + diff);
				break;

			case 3:
				System.out.println("Enter the second Number:");
				while (!S.hasNext()) {
					System.out.println("Enter a valid Integer");
				}
				b = S.nextInt();
				float div = calc.divideTwoNumbers(a, b);
				System.out.println("Division of " + a + " and " + b + " is:" + div);
				break;

			case 4:
				System.out.println("Enter the second Number:");
				while (!S.hasNext()) {
					System.out.println("Enter a valid Integer");
				}
				b = S.nextInt();
				int pro = calc.subtractTwoNumbers(a, b);
				System.out.println("Product of " + a + " and " + b + " is:" + pro);
				break;

			default:
				System.out.println("Not a valid operation");
				break;
			}

			System.out.println("Do you want to do more? 1.Yes 2.No");
			int goNext = S.nextInt();
			cont = ((goNext == 1) ? true : false);
		}
		System.out.println("Thank you for using the '"+assistantName+"' Calculator");
		S.close(); // close Scanner object
		System.exit(0);
	}

}
