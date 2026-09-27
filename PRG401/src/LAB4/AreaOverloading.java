package LAB4;

public class AreaOverloading {

	 static double computeArea(double radius) {
	        return Math.PI * radius * radius;
	    }
	    static double computeArea(double length, double width) {
	        return length * width;
	    }
	    static double computeArea(double base, double height, boolean isTriangle) {
	        return 0.5 * base * height;
	    }
	    public static void main(String[] args) {
	        double circleArea = computeArea(9);
	        double rectangleArea = computeArea(11, 5);
	        double triangleArea = computeArea(4, 6, true);
	        System.out.println("Area of Circle: " + circleArea);
	        System.out.println("Area of Rectangle: " + rectangleArea);
	        System.out.println("Area of Triangle: " + triangleArea);
	    }

}
