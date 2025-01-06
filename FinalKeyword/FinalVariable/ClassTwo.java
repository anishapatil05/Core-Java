package anisha.finalkeyword;

// ClassTwo does not implemented to the Interface so it can be access by using Interfacename
public class ClassTwo {

	public void method() {
		System.out.println(FinalVarInterface.name);
		System.out.println(FinalVarInterface.age);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassTwo obj = new ClassTwo();
		obj.method();
	}

}
