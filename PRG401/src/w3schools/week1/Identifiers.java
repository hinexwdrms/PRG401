package w3schools.week1;
public class Identifiers {
	public static void main(String args[]) {
		// Good
		int minutesPerHour = 60;

		// OK, but not so easy to understand what m actually is
		int m = 60;
		
		System.out.println("Good: minutesPerHour: "+ minutesPerHour);
		System.out.println("Bad: m: "+ m);
		
	}
}
