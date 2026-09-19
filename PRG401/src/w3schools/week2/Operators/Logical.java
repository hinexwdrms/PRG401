package w3schools.week2.Operators;

public class Logical {
	  public static void main(String[] args) {
	    boolean isLoggedIn = true;
	    boolean isAdmin = false;

	    System.out.println("Regular user: " + (isLoggedIn && !isAdmin));
	    System.out.println("Has access: " + (isLoggedIn || isAdmin));
	    System.out.println("Not logged in: " + (!isLoggedIn));
	  }
	}
