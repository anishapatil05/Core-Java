
public class WrapperClassDemo {

	public static void main(String[] args) {
		
  //		Deprecated Constructer
 //	Integer age = new Integer(98);
		
//		Assigning Proper way OF WRAPPER CLASS
		Integer age = Integer.valueOf(98);
		System.out.println(age);
		
//		Auto Boxing & Un Boxing 
		
		System.out.println("********Auto-Boxing********");
		int year = 2024;
//		Assigning primitive to  associated Wrapper class
		
		Integer year1 = year;
		System.out.println(year1);
		
		System.out.println("*******Un Boxing********");
		Integer temp =12;
		
//		Assinging wrapper to primitive
		int temp1 = temp;
		System.out.println(temp1);
		
		
		
		

	}

}
