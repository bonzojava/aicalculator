package com.aicalculator.aiagent;

import java.io.IOException;
import java.util.Scanner;

import com.aicalculator.base.Calculator;
import com.aicalculator.datatransfer.file.FileOperator;

public class AiAgent {
	
	private static String assistantName = "";
	private static Scanner S = new Scanner(System.in); // invoke Scanner object
	
	public static String getAssistantName()
	{
		if(assistantName == "") {
		FileOperator file_operator = new FileOperator();
		try {
			assistantName = file_operator.readFile("C:/aicalculator/name.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
		return assistantName;
		} else {
			return assistantName;
		}
		
	}
	
	public static void initialize()
	{
		try {
			introduction();
			calculationModule();
			S.close(); // close Scanner object
		} 
		
		catch (Exception e) {
			// introduction module can throw a file operation issue
			e.printStackTrace();
		}
	}
	
	private static void introduction()
	{
		assistantName = getAssistantName();
		System.out.println("Welcome to AI Calculator");
		if(assistantName == "") {
		System.out.println("I am an Intelligent Assistant Calculator and can assign any name that you want");
		System.out.println("What would you like to call me?");
		assistantName = S.nextLine().toString();
		saveAssistantName(assistantName);
		} else {
			System.out.println("I am an Intelligent Assistant Calculator and my name is "+assistantName);
		}
	}
	
	private static void saveAssistantName(String assistantName)
	{
		if (!(assistantName == "")) {
			FileOperator file_operator = new FileOperator();
			try {
				file_operator.writeToFile("C:/aicalculator/name.txt", false, assistantName);
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Wonderful! from now on I will be called as '" + assistantName + "'");
		}
	}
	
	private static void calculationModule()
	{
		int firstNumber, b;
		boolean cont = true;
		while (cont != false) {
			System.out.println("choose an operation you want to perform? 1. Add 2. Subtract 3. Divide 4. Multiply");
			int operation = S.nextInt();
			Calculator calc = new Calculator();
			System.out.println("Enter the first Number:");
			while (!S.hasNext()) {
				System.out.println("Enter a valid Integer");
			}
			firstNumber = S.nextInt();

			switch (operation) {
			case 1:
				System.out.println("Enter the second Number:");
				while (!S.hasNext()) {
					System.out.println("Enter a valid Integer");
				}
				b = S.nextInt();
				int sum = calc.addTwoNumbers(firstNumber, b);
				System.out.println("Sum of " + firstNumber + " and " + b + " is:" + sum);
				break;

			case 2:
				System.out.println("Enter the second Number:");
				while (!S.hasNext()) {
					System.out.println("Enter a valid Integer");
				}
				b = S.nextInt();
				int diff = calc.subtractTwoNumbers(firstNumber, b);
				System.out.println("Difference of " + firstNumber + " and " + b + " is:" + diff);
				break;

			case 3:
				System.out.println("Enter the second Number:");
				while (!S.hasNext()) {
					System.out.println("Enter a valid Integer");
				}
				b = S.nextInt();
				float div = calc.divideTwoNumbers(firstNumber, b);
				System.out.println("Division of " + firstNumber + " and " + b + " is:" + div);
				break;

			case 4:
				System.out.println("Enter the second Number:");
				while (!S.hasNext()) {
					System.out.println("Enter a valid Integer");
				}
				b = S.nextInt();
				int pro = calc.subtractTwoNumbers(firstNumber, b);
				System.out.println("Product of " + firstNumber + " and " + b + " is:" + pro);
				break;

			default:
				System.out.println("Not a valid operation");
				break;
			}

			System.out.println("Do you want to do more? 1.Yes 2.No");
			int goNext = S.nextInt();
			cont = ((goNext == 1) ? true : false);
		}
		System.out.println("Thank you for using the '"+AiAgent.getAssistantName()+"' Calculator");
		
	}
	
	
		

}
