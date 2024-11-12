import java.util.*;

//Task : To check entered number is armstrong num or not 
public class ArmStrongNumber {

	public static void main(String[] args) {
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num = sc.nextInt();

//		to take reference variable temp
		int temp = num;

//		created object of non-static method
		ArmStrongNumber obj = new ArmStrongNumber();
		int pow = obj.powcount(temp);

		while (temp > 0) {
			int Ld = temp % 10;
			int LdPower = (int) Math.pow(Ld, pow);
			sum = sum + LdPower;
			temp /= 10;
		}

		if (num == sum) {
			System.out.println(num + " is Armstromg Number");
		} else {
			System.out.println(num + " is not Armstromg Number");
		}

	}

	public int powcount(int temp) {

		int count = 0;
		while (temp > 0) {
			temp /= 10;
			count++;
		}
		return count;
	}

}
