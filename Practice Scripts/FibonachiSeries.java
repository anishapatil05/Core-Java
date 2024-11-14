import java.util.*;

// Print the Fibonachi series upto user enters the number
// 0,1,1,2,3,5.....
public class FibonachiSeries {

	public static void main(String[] args) {
		int a = 0, b = 1;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.println(a);

			int c = a + b;
			a = b;
			b = c;
		}
	}

}
