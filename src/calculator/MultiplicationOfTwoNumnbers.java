package calculator;

import java.util.Scanner;

public class MultiplicationOfTwoNumnbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		int number1 = input.nextInt();
		System.out.println("Please enter second number");
		int number2 = input.nextInt();
		int output = number1 * number2;
		System.out.println(number1+ " x " +number2+ " = "+ output);

		input.close();
	}

}
