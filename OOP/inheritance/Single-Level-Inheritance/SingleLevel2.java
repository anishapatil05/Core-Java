package inheritance;

public class SingleLevel2 extends SingleLevel {
	
	public int sub(int a, int b)
	{
		return a-b;
	}

	public static void main(String[] args) {
	     SingleLevel2 obj = new SingleLevel2();
	      int add =obj.sum(10, 89);
	      System.out.println(add);
	      int subtraction =obj.sub(56,8);
	      System.out.println(subtraction);
	}

}
