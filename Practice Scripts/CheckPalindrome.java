import java.util.*;

// Task : To check entered number is Palindrome  or not.
public class CheckPalindrome {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Number: ");
		int num = sc.nextInt();

		int rev = 0;
		int temp = num;

		while (temp > 0) {
			int lastDigit = temp % 10;
			rev = (rev * 10) + lastDigit;
			temp /= 10;
		}
		if (rev == num) {
			System.out.println(num + "  is Palindrome");
		} else {
			System.out.println(num + "  is not Palindrome");
		}

	}

}
