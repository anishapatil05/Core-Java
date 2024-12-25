
public class StaticBlock {

//	 Static block exected always before the main method
	static {
		System.out.println("This is static block");
	}

	static {
		System.out.println("This is static block 2");
	}

	public static void main(String[] args) {
		System.out.println("this is main method");

	}

}
