package LAB3;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int n = keyboard.nextInt();
		
		int factorial = 1;
		
		for (int i = 1; i <= n; i++) {
			factorial = factorial * i;
		}
		
		System.out.println("Factorial = " + factorial);
		
		keyboard.close();
	}
}
