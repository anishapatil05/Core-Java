package inheritance;
//child class 2: HierachicalLevel2
public class HierachicalLevel2 extends HierachicalLevel {
	
	public int Multi(int a, int b)
	{
		return a*b;
	}

	public static void main(String[] args) {
		HierachicalLevel2 objHierachicalLevel2= new HierachicalLevel2();
		System.out.println(objHierachicalLevel2.calculatoradd(9, 4));
		System.out.println(objHierachicalLevel2.Multi(9, 0));
	}

}
