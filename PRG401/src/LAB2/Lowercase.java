package LAB2;

import java.util.Scanner;

public class Lowercase {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String text;

        System.out.print("Enter a string: ");
        text = input.nextLine();

        System.out.println("Lowercase = " + text.toLowerCase());

        input.close();
    }
}