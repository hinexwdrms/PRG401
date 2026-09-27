package LAB4;
import java.util.Scanner;
public class MonthName {
	 static String getMonthName(int month) {
	        switch (month) {
	            case 1:
	                return "January";
	            case 2:
	                return "February";
	            case 3:
	                return "March";
	            case 4:
	                return "April";
	            case 5:
	                return "May";
	            case 6:
	                return "June";
	            case 7:
	                return "July";
	            case 8:
	                return "August";
	            case 9:
	                return "September";
	            case 10:
	                return "October";
	            case 11:
	                return "November";
	            case 12:
	                return "December";
	            default:
	                return "No Corresponding Month Name";
	        }
	    }

	    public static void main(String[] args) {
	        Scanner input = new Scanner(System.in);
	        System.out.print("Enter month number (1 to 12): ");
	        int month = input.nextInt();
	        String monthName = getMonthName(month);
	        System.out.println("Month Name: " + monthName);
	        input.close();
	    }
}
