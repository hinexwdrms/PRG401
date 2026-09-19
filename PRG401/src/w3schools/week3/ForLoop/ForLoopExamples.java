package w3schools.week3.ForLoop;

public class ForLoopExamples {
	  public static void main(String[] args) {
		  
		// Print Even Numbers 
	    for (int i = 0; i <= 10; i = i + 2) {
	      System.out.println(i);
	    }  
	    System.out.println();
	    
	    // Sum of Numbers 
	    int sum = 0;
	    for (int i = 1; i <= 5; i++) {
	      sum = sum + i;
	    }
	    System.out.println("Sum is " + sum);
	    System.out.println();
	    
	    // Countdown
	    for (int i = 5; i > 0; i--) {
	        System.out.println(i);
	      }
	    System.out.println();
	}
}
