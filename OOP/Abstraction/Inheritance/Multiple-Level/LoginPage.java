package anisha.abstraction;

//Example of Multiple Inheritance in Interfaces
public class LoginPage implements PasswordThree {

	@Override
	public void printPassword() {
		System.out.println("PasswordOne: anishapatil");
		
	}
	@Override
	public void showPassword() {
		System.out.println("PasswordTwo: anu@05");
		
	}
	@Override
	public void showPasswordOptions() {
		// TODO Auto-generated method stub
		System.out.println("Password Options: 1.PasswordOne, 2.PasswordTwo");
	}
	public static void main(String[] args) {
		LoginPage obj = new LoginPage();
		obj.showPasswordOptions();
		obj.printPassword();
		obj.showPassword();

	}

}
