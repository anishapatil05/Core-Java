package anisha.abstraction;

	// Single level inheritance in Interface
	public class CalculatorImp implements Calculator2 {

		public void add(int a, int b) {
			int c = a + b;
			System.out.println("Addition is: " + c);
		}

		public void sub(int a, int b) {
			int c = a - b;
			System.out.println("Subtraction is: " + c);
		}

		public void mul(int a, int b) {
			int c = a * b;
			System.out.println("Multiplication is: " + c);
		}

		public void div(int a, int b) {
			int c = a / b;
			System.out.println("division is: " + c);
		}

		public static void main(String[] args) {
			CalculatorImp obj = new CalculatorImp();
			obj.add(5, 8);
			obj.sub(11, 2);
			obj.mul(2, 2);
			obj.div(4, 2);

		}

	}
