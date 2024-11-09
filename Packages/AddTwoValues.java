// Package sumation call the method add from addition package sum class 
package sumation;

// importing method sum() from different package (addition) of class sum...
import addition.sum;

public class AddTwoValues {

	public static void main(String[] args) {
		// calling non-static method sum() from addition package...
		 sum s3 = new sum();
		 s3.add(9, 5);	 
	}
}
