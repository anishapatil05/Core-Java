package anisha.finalkeyword;

// ClassOne is direct access to the Interface FinalVar
public class ClassOne implements FinalVarInterface {

	public void methodTwo() {
		System.out.println("this is method Two");
		System.out.println(name);
		System.out.println(age);
	}

	public void method1() {
		System.out.println("method from interface");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassOne obj = new ClassOne();
		obj.method1();
		obj.methodTwo();
	}

}
