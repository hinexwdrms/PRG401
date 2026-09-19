package LAB2;

import java.util.Scanner;

public class DisplayCar {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String registrationNumber;
        String model;
        double price;
        String make;

        System.out.print("Enter Registration Number: ");
        registrationNumber = input.nextLine();

        System.out.print("Enter Model: ");
        model = input.nextLine();

        System.out.print("Enter Price: ");
        price = input.nextDouble();
        input.nextLine();

        System.out.print("Enter Make: ");
        make = input.nextLine();

        System.out.println("\nCar Information");
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Model: " + model);
        System.out.println("Price: " + price);
        System.out.println("Make: " + make);

        input.close();
    }
}
