package w3schools.week4.Methods;

public class ReturnValuesExample {
	  static int myMethod(int x, int y) {
	    return x + y;
	  }

	  public static void main(String[] args) {
	    System.out.println(myMethod(5, 3));
	    
	    // You can also store the result in a variable
	    int z = myMethod(5, 3);
	    System.out.println(z);
	  }
	}
