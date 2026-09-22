package LAB3;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int number = keyboard.nextInt();
		
		int original = number;
		int reverse = 0;
		
		while (number != 0) {
			int digit = number % 10;
			reverse = reverse * 10 + digit;
			number = number / 10;
		}
		
		if (original == reverse) {
			System.out.println("Palindrome");
		} else {
			System.out.println("Not Palindrome");
		}
		
		keyboard.close();
	}
}
