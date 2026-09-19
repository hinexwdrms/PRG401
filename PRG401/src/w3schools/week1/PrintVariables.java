package w3schools.week1;
public class PrintVariables {

    public static void main(String[] args) {
    	String name = "John";
    	System.out.println("Hello " + name);
    	
    	String firstName = "John ";
    	String lastName = "Doe";
    	String fullName = firstName + lastName;
    	System.out.println(fullName);
    	
    	int x = 5;
    	int y = 6;
    	System.out.println(x + y); // Print the value of x + y

    	System.out.println("The sum is " + x + y);   // Prints: The sum is 56
    	System.out.println("The sum is " + (x + y)); // Prints: The sum is 11
        
    }
}