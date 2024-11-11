import java.util.*;

//  To create banking Application based on users Available Balance

public class Assignment4 {
	double available_B = 50000;
	double withdrawn_A;
	double deposite_A;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		System.out.println("Enter Your choise: 1.checkBalance 2.withdrawnAmmount 3.depositeAmmount");

		Assignment4 obj = new Assignment4();
		int choise = sc.nextInt();

		switch (choise) {
		case 1:
			obj.checkingBalance();
			break;

		case 2:
			obj.withdrawnAmmount();
			break;

		case 3:
			obj.depositeAmmount();
		}

	}

	public double checkingBalance() {

		System.out.println("Enter Your Account Number");
		String Account_Num = sc.next();

		if (Account_Num.matches("\\d{12}")) {
			System.out.println("Your Available Balance: " + available_B);
		} else {
			System.out.println("Your Account number is wrong ... Please Try again");
		}

		return available_B;
	}

	public double withdrawnAmmount() {
		System.out.println("Enter your withdrawn ammount: ");
		withdrawn_A = sc.nextDouble();

		if (available_B >= withdrawn_A) {
			available_B = available_B - withdrawn_A;
			System.out.println("Withdrawn Success & Updated Available balance is: " + available_B);
		} else {
			System.out.println("Withdrawn is failed due to Insufficient Funds " + available_B);
		}
		return available_B;
	}

	public double depositeAmmount() {
		System.out.println("Enter your Deposite ammount: ");
		deposite_A = sc.nextDouble();

		available_B = available_B + deposite_A;
		System.out.println("Deposite Success & Updated available balance is: " + available_B);
		return available_B;
	}

}
