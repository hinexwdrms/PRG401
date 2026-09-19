package LAB2;

import java.util.Scanner;

public class StringConcatenation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String str1, str2;

        System.out.print("Enter first string: ");
        str1 = input.nextLine();

        System.out.print("Enter second string: ");
        str2 = input.nextLine();

        String result = str1.substring(1) + str2.substring(1);

        System.out.println("Result = " + result);

        input.close();
    }
}
