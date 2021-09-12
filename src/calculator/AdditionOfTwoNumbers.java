package calculator;

import java.util.Scanner;

public class AdditionOfTwoNumbers {

	// Create a calculator application/app which will help you to do
	// Addition
	// Subtraction
	// Multiplication
	// Division
	// User input is needed
	// Create a github repository and push you repository

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		int number1 = input.nextInt();
		System.out.println("Please enter second number");
		int number2 = input.nextInt();
		int addition = number1 + number2;
		System.out.println(number1+ "+" +number2 + " = " + addition);

		input.close();
	}

}
