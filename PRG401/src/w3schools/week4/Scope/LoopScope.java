package w3schools.week4.Scope;

public class LoopScope {
	  public static void main(String[] args) {

	    for (int i = 0; i < 5; i++) {
	      System.out.println(i); // i is accessible here
	    }

	    // i is NOT accessible here
	  }
	}
