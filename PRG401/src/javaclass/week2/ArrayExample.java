package javaclass.week2;

public class ArrayExample {
	public static void main(String[] args) {
		int[] scores = new int[10];
		int index = 0;
	
		System.out.println("The size of the array is :" + scores.length);
	
		scores[index] = 299;
	
		System.out.println("The content of element " + index + " of  the array is " + scores[index]);
	}
}
