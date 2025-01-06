package anisha.finalkeyword;

public class FinalVariable {

//	final variables : after intilizining the var it does not modify in a class
	final String dateOfBirth = "5/7/2004";
	String companyName = "sony";

	public void printingInfo() {
//		dateOfBirth var : does not modify because it is final var
		System.out.println(dateOfBirth);
		System.out.println(companyName);

//		 we can change the companyName bcz it's not a final 
		companyName = "apple";
		System.out.println(companyName);
	}

	public static void main(String[] args) {
		FinalVariable obj = new FinalVariable();
		obj.printingInfo();

	}

}
