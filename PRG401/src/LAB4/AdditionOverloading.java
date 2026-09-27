package LAB4;

public class AdditionOverloading{
    static int add(int a, int b) {
        return a + b;
    }
    static int add(int a, int b, int c) {
        return a + b + c;
    }
    static double add(double a, double b) {
        return a + b;
    }
    
    public static void main(String[] args) {
    		System.out.println("Sum of two integers: " + add(20, 30));
    		System.out.println("Sum of three integers: " + add(10, 30, 40));
    		System.out.println("Sum of two double values: " + add(10.5, 20.5));
    }
}
