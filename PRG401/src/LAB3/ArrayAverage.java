package LAB3;

public class ArrayAverage {

	public static double average(int[] array) {
		
		int sum = 0;
		
		for (int number : array) {
			sum = sum + number;
		}
		
		return (double) sum / array.length;
	}

	public static void main(String[] args) {
		
		int[] numbers = {10, 20, 30, 40, 50};
		
		double result = average(numbers);
		
		System.out.println("Average = " + result);
	}
}
