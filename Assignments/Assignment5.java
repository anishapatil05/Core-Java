package constructor;

// Study of parametrized constructor & execution.
public class Assignment5 {

	public Assignment5() {
		System.out.println("calling Defaule constructor");
	}

	public Assignment5(int age) {
		System.out.println("age is: " + age);
	}

	public Assignment5(String name) {
		System.out.println("name: " + name);
	}

	public Assignment5(int pincode, long mobile) {
		System.out.println("pincode: " + pincode);
		System.out.println("mobile: " + mobile);
	}

	public static void main(String[] args) {
		Assignment5 a1 = new Assignment5();
		Assignment5 a2 = new Assignment5(21);
		Assignment5 a3 = new Assignment5("Anisha Patil");
		Assignment5 a4 = new Assignment5(416101, 926792705);

	}

}
