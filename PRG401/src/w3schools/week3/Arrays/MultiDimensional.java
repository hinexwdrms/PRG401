package w3schools.week3.Arrays;

public class MultiDimensional {
	  public static void main(String[] args) {
		//Accessing Elements
	    int[][] myNumbers = { {1, 4, 2}, {3, 6, 8} };
	    System.out.println(myNumbers[1][2]); // Outputs 8
	    
	    System.out.println(myNumbers[0][1]); // Outputs 4
	    
	    //Change Values
	    myNumbers[1][2] = 9;
	    System.out.println(myNumbers[1][2]); // Outputs 9 instead of 8
	    
	    //Length
	    int[][] myNumbers1 = { {1, 4, 2}, {3, 6, 8, 5, 2} };

	    System.out.println("Rows: " + myNumbers1.length);             // 2
	    System.out.println("Cols in row 0: " + myNumbers1[0].length); // 3
	    System.out.println("Cols in row 1: " + myNumbers1[1].length); // 5
	}
}
