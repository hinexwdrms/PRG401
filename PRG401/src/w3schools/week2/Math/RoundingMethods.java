package w3schools.week2.Math;

public class RoundingMethods {
    public static void main(String[] args) {
        
        // Rounding methods
        System.out.println(Math.round(4.6));  // rounds nearest integer
        System.out.println(Math.ceil(4.1));   // rounds up
        System.out.println(Math.floor(4.9));  // rounds down
        
        // Random numbers
        System.out.println(Math.random());
        
        // Generate random number between 0 and 100
        int randomNum = (int) (Math.random() * 101);
        System.out.println(randomNum);
        
    }
}
