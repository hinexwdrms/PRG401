package javaclass.week5;

public class ViewFlight {

	public static void main(String[] args) {
		Flight f1 = new Flight();
		f1.displayDetails();
		
		Flight f2 = new Flight (4343 , "Buddha Airlines", "Jhapa", "Kathmandu", "Departing");
		f2.displayDetails();
		
		Flight f3 = new Flight();
		f3.setAirline("Shree Airlines");
		f3.setFlightNo(1928);
		f3.setStatus("On Air");
		
		System.out.println(f3.getAriline());
		System.out.println(f3.getFlightNo());
		System.out.println(f3.getStatus());
		
		System.out.println(f3);
	}

}
