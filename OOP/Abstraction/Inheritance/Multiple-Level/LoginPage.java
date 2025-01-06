package anisha.abstraction;

//Example of Multiple Inheritance in Interfaces
public class LoginPage implements PasswordOne,PasswordTwo {

	@Override
	public void printPassword() {
		System.out.println("PasswordOne: anishapatil");
		
	}
	@Override
	public void showPassword() {
		System.out.println("PasswordTwo: anu@05");
		
	}
	public static void main(String[] args) {
		LoginPage obj = new LoginPage();
		obj.printPassword();
		obj.showPassword();

	}

}
