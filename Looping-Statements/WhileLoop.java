// Example of while loop
public class WhileLoop {

	public static void main(String[] args) {

		// initilization
		int value = value();

		// Condition (value<=100)
		while(value<=100) 
		{
			System.out.println(value);
			// inc/dec (value++ / value--)
			value++;
		}
		System.out.println(value);
	}
	// method value()
       public static int value()
	{
		return 4;
	}
}
