package calculator;

import java.util.Scanner;

public class DivisionOfTwoNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter first number");
		int number1 = input.nextInt();
		System.out.println("Please enter second number");
		int number2 = input.nextInt();
		int dividion = number1/number2;
		System.out.println("Division of two numbers is :" + dividion);

		input.close();
	}

}
