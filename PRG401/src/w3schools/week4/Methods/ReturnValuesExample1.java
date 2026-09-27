package w3schools.week4.Methods;

public class ReturnValuesExample1 {
	  // Method that doubles the number
	  static int doubleGame(int x) {
	    return x * 2;
	  }

	  public static void main(String[] args) {
	    for (int i = 1; i <= 5; i++) {
	      System.out.println("Double of " + i + " is " + doubleGame(i));
	    }
	  }
	}