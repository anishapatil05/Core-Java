
public class WhileLoop {

	public static void main(String[] args) {
	
		int value = value();
		
		while(value<=100)
		{
			System.out.println(value);
			value++;
		}
		System.out.println(value);
	}

	public static int value()
	{
		return 4;
	}

}
