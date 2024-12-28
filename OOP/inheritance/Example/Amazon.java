package inheritance;

import java.util.Scanner;

public class Amazon {

	public static void main(String[] args) {

		PaymentFour obj = new PaymentFour();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your choise: ");

		System.out.println("1. NetBanking Payment");
		System.out.println("2. DebitCard Payment");
		System.out.println("3. CreditCard Payment");
		System.out.println("4. UPI Payment");

		int choise = sc.nextInt();

		if (choise == 1)

		{
			obj.netBanking();
		} else if (choise == 2) {
			obj.debitCardPayment();
		} else if (choise == 3) {
			obj.creditCardPayment();
		} else if (choise == 4) {
			obj.UPIPayment();
		} else {
			System.out.println("Enter correct choise from above");
		}

	}

}
