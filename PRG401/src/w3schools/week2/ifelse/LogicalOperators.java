package w3schools.week2.ifelse;

public class LogicalOperators {
	  public static void main(String[] args) {
	    int a = 200;
	    int b = 33;
	    int c = 500;

	    //AND
	    if (a > b && c > a) {
	    	System.out.println("Both conditions are true");
	      
	    //OR
	     if (a > b || a > c) {
	    	 System.out.println("At least one condition is true");
	        
	     //NOT
	      if (!(a < b)) {
	    	  System.out.println("a is NOT greater than b");
	        	}
	      }
	    }
	  }
	}