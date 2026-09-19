package w3schools.week3.Arrays;

public class MDArrayForEach {
	  public static void main(String[] args) {
	    int[][] myNumbers = { {1, 4, 2}, {3, 6, 8, 5, 2} };

	    for (int[] row : myNumbers) {
	      for (int num : row) {
	        System.out.println(num);
	      }
	    }
	  }
	}
