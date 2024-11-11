import java.util.*;

// Task : Reverse a number 
public class ReverseNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		int rev_num = 0;

		while (num > 0) {
			int LD = num % 10;
			rev_num = (rev_num * 10) + LD;
			num /= 10;
		}
		System.out.println("Reversed number is: " + rev_num);

	}

}
