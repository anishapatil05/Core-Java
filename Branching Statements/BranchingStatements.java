import java.util.*;
/*  Branching Statements: 1.break;
                          2.continue
                          3.return        */    

public class BranchingStatements {

	public static void main(String[] args) {
		
//		calling printOperation(90, 56, "SUB") 
		 BranchingStatements obj = new  BranchingStatements();
		 System.out.println(obj.printOperation(90, 56, "SUB"));
		
// Keep entering numbers till user enters a multiple of 10	
		
     System.out.println("***break Statement***");
	 Scanner sc = new Scanner(System.in);
	 System.out.println("Enter the number");
	
	 
	  do {
		  int n = sc.nextInt();
		  
		  if(n % 10 == 0)
		  {
			  break;
		  }
		  System.out.println(n);
	  }while(true);
	  
	// display all numbers expect the multiple of 10	  
	  System.out.println("***continue Statement***");
	
	  System.out.println("Enter the number");
		
	  do {
		  int n = sc.nextInt();
		  
		  if(n % 10 == 0)
		  {
			  continue;
		  }
		  System.out.println(n);
	  }while(true);
	 
	  
//	  Req : Write logic , based on the operation name , Operation happened;
	  
//	  10,20 , ADD
//	  10,20 , SUB
//	  40,30 , MUL;
 
	}
	public int printOperation(int a, int b, String opr)
	{
		if(opr == "ADD")
		{
			return a+b;
		}
		else if(opr =="SUB")
		{
			return a-b;
		}
		else if(opr =="MUL")
		{
			return a*b;
		}
		else if(opr =="DIV")
		{
			return a/b;
		}
		else {
			System.out.println("Enter the correct one above operation");
			return 0;
			}
	}

}
