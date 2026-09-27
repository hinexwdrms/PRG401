package javaclass.week5;

public class Flight {
	private int flightNo ;
	private String airline;
	private String originCity;
	private String destinationCity;
	private String status;
	
	
	
	public Flight() {
		flightNo = 2345;
		airline = "Yeti Airlines";
		originCity = "Bhadrapur";
		destinationCity = "Pokhara";
		status = "Landed";
		}
	public Flight (int flightNo, String airline, String originCity, String destinationCity, String status)
	{
		this.flightNo = flightNo;
		this.airline = airline;
		this.originCity = originCity;
		this.destinationCity = destinationCity;
		this.status = status;
	}
	
	public int getFlightNo() {
		return flightNo;
	}
	public void setFlightNo(int value) {
		flightNo = value; 
	}
	public String getAriline() {
		return airline;
	}
	public void setAirline(String value) {
		airline = value;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String value) {
		status = value;
	}
	public void displayDetails() {
		System.out.println("Fight number: "+ flightNo );
		System.out.println("Airline: "+ airline);
		System.out.println("City of Origin: "+ originCity );
		System.out.println("Destination City: "+ destinationCity);
		System.out.println("Status : "+ status );
		
	
	}
	public String toString() {
		return "Flight number: " + flightNo + "," + "Airline: " + airline;
		}
	}
