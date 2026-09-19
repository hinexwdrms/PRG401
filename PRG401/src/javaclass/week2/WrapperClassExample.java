package javaclass.week2;
import java.util.Scanner;

public class WrapperClassExample {
	public static void main(String[] args) {
		float price, totalprice;
		int NoItems;
		String input ="";
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter number of items: ");
		input = keyboard.nextLine();
		NoItems = Integer.parseInt(input);
		
		System.out.print("Please enter price for one item: ");
		input = keyboard.nextLine();
		price = Float.parseFloat(input);
		totalprice = price * NoItems;
		System.out.print("Total amount due is : $" + totalprice);
		
		keyboard.close();
	}
}
