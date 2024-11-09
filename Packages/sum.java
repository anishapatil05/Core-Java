// addition Package
package addition;

public class sum {
           public static void main(String[] args) {
             //  calling non-static method...           
		 sum s = new sum();
		 s.add(9, 5);
	}
	// non-static method add(int a , int b)
	public void add(int a , int b)
	{
	   int res=a+b;
	   System.out.println("sum is: "+res);
	}

}
