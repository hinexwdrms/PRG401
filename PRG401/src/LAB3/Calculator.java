package LAB3;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter first number: ");
		int num1 = keyboard.nextInt();
		
		System.out.print("Enter second number: ");
		int num2 = keyboard.nextInt();
		
		System.out.print("Enter operator (+, -, *, /): ");
		char operator = keyboard.next().charAt(0);
		
		switch (operator) {
		case '+':
			System.out.println("Result = " + (num1 + num2));
			break;
			
		case '-':
			System.out.println("Result = " + (num1 - num2));
			break;
			
		case '*':
			System.out.println("Result = " + (num1 * num2));
			break;
			
		case '/':
			System.out.println("Result = " + (num1 / num2));
			break;
			
		default:
			System.out.println("Unsupported operator");
		}
		
		keyboard.close();
	}
}
