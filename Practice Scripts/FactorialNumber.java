import java.util.*;

// Factorial Number : ex. 3! = 3*(3-1)=6.
public class FactorialNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();
//		base cases
		if (num == 1 || num == 0) {
			num = 1;
		}

		int res = 1;
		for (int i = 2; i <= num; i++) {
			res = res * i;
		}
		System.out.println(res);

	}

}
