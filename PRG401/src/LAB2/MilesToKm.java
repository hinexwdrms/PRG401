package LAB2;

import java.util.Scanner;

public class MilesToKm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        float miles;

        System.out.print("Enter miles: ");
        miles = input.nextFloat();

        float kilometers = miles * 1.60935f;

        System.out.println("Kilometers = " + kilometers);

        input.close();
    }
}
