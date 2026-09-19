package LAB2;

import java.util.Scanner;

public class ThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double num1, num2, num3;

        System.out.print("Enter first number: ");
        num1 = input.nextDouble();

        System.out.print("Enter second number: ");
        num2 = input.nextDouble();

        System.out.print("Enter third number: ");
        num3 = input.nextDouble();

        double total = num1 + num2 + num3;
        double average = total / 3;
        double multiplication = num1 * num2 * num3;

        System.out.println("Total = " + total);
        System.out.println("Average = " + average);
        System.out.println("Multiplication = " + multiplication);

        input.close();
    }
}
