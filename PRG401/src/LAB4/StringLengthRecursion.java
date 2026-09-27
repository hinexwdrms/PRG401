package LAB4;
public class StringLengthRecursion {
	 static int findLength(String str, int index) {
	        if (index == str.length()) {
	            return 0;
	        }

	        return 1 + findLength(str, index + 1);
	    }
	    public static void main(String[] args) {
	        String str = "Hello World";
	        int length = findLength(str, 0);
	        System.out.println("String: " + str);
	        System.out.println("Length of string: " + length);
	    }
}
