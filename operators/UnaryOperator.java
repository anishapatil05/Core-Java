package operators;

public class UnaryOperator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("-----UNARY OPERTAOR-----");
		
         //Positive & negative  Number 
		  int l = +10;
		  int f = -10;
		  System.out.println(l);
		  System.out.println(f);
		  
				  
		
        // Prefix ---> Increment Operator		
		  System.out.println("---INCREMENT & DECREMENT OPERATOR---");
		int a= 100;
		int b = ++a;
		System.out.println(a);
		System.out.println(b);
		
		System.out.println(a++ + --b);
		
                //Suffix
	            int val1 = 200;
		        int val2 = val1++;
		        System.out.println(val1);
		        System.out.println(val2);
		
		// Prefix ---> Decrement Operator		
				int s = 100;
				int k = --s;
				System.out.println(s);
				System.out.println(b);
				
		        //Suffix
				int num1 = 200;
				int num2 = num1++;
				System.out.println(num1);
				System.out.println(num2);
				
		int val = 20;
		System.out.println(val++);
		System.out.println(++val);
		System.out.println(val--);
		System.out.println(--val);
				
        // ! ---> NOT Operator
		System.out.println("---NOT OPERATOR---");
		boolean areYouFemale = true;
		areYouFemale = !areYouFemale;
		System.out.println(areYouFemale);
		System.out.println(!areYouFemale);
		
	}

}
