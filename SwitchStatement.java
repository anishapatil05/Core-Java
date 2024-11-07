// Switch Statements
public class SwitchStatement {

	public static void main(String[] args) {

		int a = 10;
		int b = 30;
		
		String arithmaticOperation = "MUL";
		
		switch( arithmaticOperation) {
		case "ADD" : 
			int res = a+b;
			System.out.println("Addition is: "+res);		
			break;
			
		case "SUB" : 
			res = a-b;
			System.out.println("Subtracion is: "+res);		
			break;
			
		case "MUL":
			res = a*b;
			System.out.println("Multiplication is: "+res);		
			break;
			
		case "DIV" :
			res = a/b;
			System.out.println("division is: "+res);		
			break;
			
		case "REM" :
			res = a%b;
			System.out.println("Reminder is: "+res);		
			break;		
		
	    default :
	    	System.out.println("Please choose above correct one");
			
	    }

     }
   }
