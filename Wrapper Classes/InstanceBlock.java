
public class InstanceBlock {
	static {
		System.out.println("This is static block");
	}

//	 Instance block 1
	{
		System.out.println("This is Instance block1");
	}

//	Instance block 2
	{
		System.out.println("This is Instance block2");
	}

//	Constructor
	public InstanceBlock() {
		System.out.println("this is constructer");
	}

	public static void main(String[] args) {
		System.out.println("This is main method");

		InstanceBlock obj = new InstanceBlock();

	}

}
