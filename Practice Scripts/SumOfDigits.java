import java.util.*;

// Task : Sum of Digit in number entered by user ;
public class SumOfDigits {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();
		int sum = 0;

		while (num > 0) {
			int lastDigit = num % 10;
			sum += lastDigit;
			num /= 10;
		}
		System.out.println("sum of digit is: " + sum);
	}

}
