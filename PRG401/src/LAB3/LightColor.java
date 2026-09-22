package LAB3;

import java.util.Scanner;

public class LightColor {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter light color: ");
		String lightColor = keyboard.nextLine();
		
		switch (lightColor.toLowerCase()) {
		case "red":
			System.out.println("Stop");
			break;
			
		case "yellow":
			System.out.println("Ready");
			break;
			
		case "green":
			System.out.println("Go");
			break;
			
		default:
			System.out.println("Invalid color");
		}
		
		keyboard.close();
	}
}
