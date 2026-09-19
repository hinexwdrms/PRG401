package LAB2;

import java.util.Scanner;

public class SquareCalculation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int side;

        System.out.print("Enter the length of the square's side: ");
        side = input.nextInt();

        int perimeter = 4 * side;
        int area = side * side;

        System.out.println("Perimeter = " + perimeter);
        System.out.println("Area = " + area);

        input.close();
    }
}
