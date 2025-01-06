package anisha.abstraction;

//Example of Multilevel inheritance in Interface
public class InterfaceImpl implements InterfaceThree {

	@Override
	public void method1() {
		System.out.println("This is method one");

	}

	public void method2() {
		System.out.println("This is method two");

	}

	public void method3() {
		System.out.println("This is method three");

	}

	public static void main(String[] args) {
		InterfaceImpl obj = new InterfaceImpl();
		obj.method1();
		obj.method2();
		obj.method3();

	}

}
