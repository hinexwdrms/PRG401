package javaclass.week4;

public class Calculation {
	private int num1, num2, result;
	
	public Calculation() {
		num1 = 10;
		num2 = 5;
	}
	
	public Calculation(int num1, int num2) {
		this.num1 = num1;
		this.num2 = num2;
	}
	
	public void add() {
		result = num1 + num2;
	}
	
	public void displayResult() {
		System.out.println("Result :"+result);
	}
	
	public static void main(String []args) {
		Calculation cal1 = new Calculation();
		cal1.add();
		cal1.displayResult();
		Calculation cal2 = new Calculation(20, 30);
		cal2.add();
		cal2.displayResult();
	}
}
