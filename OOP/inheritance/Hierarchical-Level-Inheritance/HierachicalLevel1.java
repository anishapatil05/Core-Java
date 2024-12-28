package inheritance;
// Base Class: HierachicalLevel
// Child class 1 :  HierachicalLevel1
public class HierachicalLevel1 extends HierachicalLevel{
   
	 public int subtraction(int a, int b) {
		 return a-b;
}
	public static void main(String[] args) {
		HierachicalLevel1 obj = new HierachicalLevel1();
		System.out.println(obj.calculatoradd(7, 9));
		System.out.println(obj.subtraction(7, 3));

	}

}
