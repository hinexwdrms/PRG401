package w3schools.week4.Recursion;

public class SumRecursion {
	  public static int sum(int k) {
	    if (k > 0) {
	      return k + sum(k - 1);
	    } else {
	      return 0;
	    }
	  }

	  public static void main(String[] args) {
	    int result = sum(10);
	    System.out.println(result);
	  }
	}
