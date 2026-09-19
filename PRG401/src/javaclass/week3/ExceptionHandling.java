package javaclass.week3;

import java.util.Scanner;

public class ExceptionHandling {
    public static void main(String[] args) {

        float price, totalprice;
        int NoItems;
        String input = "";

        Scanner keyboard = new Scanner(System.in);

        System.out.print("Please enter number of items: ");

        try {
            input = keyboard.nextLine();
            NoItems = Integer.parseInt(input);

            System.out.print("Please enter price for one item: ");
            input = keyboard.nextLine();
            price = Float.parseFloat(input);

            totalprice = price * NoItems;

            System.out.print("Total amount due is: $" + totalprice);
        }
        catch (NumberFormatException e) {
            System.out.print("Please enter a valid number.");
        }

        keyboard.close();
    }
}


