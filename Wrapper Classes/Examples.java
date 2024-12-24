// Wrapper class Examples 
public class Examples {

	public static void main(String[] args) {
		
//	                Exapmple 1
//		using toString()
		Integer age = Integer.valueOf("56");
		System.out.println(age);
		System.out.println(age.toString());
		
		Float f1 = Float.valueOf(9.9f);
		System.out.println(f1.toString());
		
//		           Example 2 
//		It gives an Exception : java.lang.NumberFormatException
//		Double d1 = Double.valueOf("anu");
//		System.out.println(d1);
//		System.out.println(d1.toString());
		
//		          Example 3
//		Conversion of Wrapper to String 
		Integer i1 = Integer.valueOf(100);
		Integer i2 = Integer.valueOf("1000");
		
		System.out.println(i1+i2);
		
		String str1 = i1.toString();
		String str2 = i2.toString();
		
		System.out.println(str1+str2);
		
//		        Example 4
		Integer t = Integer.valueOf(100);
		System.out.println(t.toString());
		
//		int a = 8;  
//		System.out.println(a.toString());   .......It gives an error
		
//		       Example 5
//		Conversion of Primitive to String
		int b = 2;
		int c = 3;
		System.out.println(b+c);
		
		String str3 = String.valueOf(b);
	    String str4 = String.valueOf(c);
	    
	    System.out.println(str3+str4);
	    
//	           Example 6
//	    Conversion of Wrapperclass to primitive using methods
	    
	    Integer i = Integer.valueOf(90);
	    System.out.println(i);
	    
	    int w = i.intValue();
	    double d = i.doubleValue();
	    float f = i.floatValue();
	    
	    System.out.println("int value: "+w);
	    System.out.println("float value: "+f);
	    System.out.println("double value: "+d);
	    
//	           Exapmle 7
//	    Conversion of String to primitive 
	    String strr = "100";
	    
	    int k = Integer.parseInt(strr);
	    System.out.println(k);
	    
		
	}

}
