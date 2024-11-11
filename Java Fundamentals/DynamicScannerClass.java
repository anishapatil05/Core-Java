
/* Pre-defined Class : 1. Scanner
                       2. BufferReader 
*/
import java.util.*;

public class DynamicScannerClass {

	public static void main(String[] args) {
//	  Task : Create Registration Form by taking input from user

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter Your Name: ");
		String name = sc.nextLine();

		System.out.println("Enter Your age: ");
		int age = sc.nextInt();

		System.out.println("Enter Your Email: ");
		String email = sc.next();

		System.out.println("Enter Your city: ");
		String city = sc.next();

		System.out.println("***** Registration Form ******");

		System.out.println("name: " + name);
		System.out.println("age: " + age);
		System.out.println("email: " + email);
		System.out.println("city: " + city);

	}

}
