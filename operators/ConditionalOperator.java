package operators;

public class ConditionalOperator {

	public static void main(String[] args) {
		System.out.println("**** AND OPERATOR****");
//		Person 1
		String country1="Pakistan";
		char gender1 ='M';
		String skill1 ="Bolwer";
		
		boolean iseligible = country1 == "India" && gender1=='M'&& skill1 == "Bolwer";
		System.out.println(iseligible);
		
//		Person2
		String country2="India";
		char gender2 ='M';
		String skill2 ="Bolwer";
		 iseligible = country2 == "India" && gender2=='M'&& skill2 == "Bolwer";
		System.out.println(iseligible);
		
		System.out.println("**** OR OPERATOR****");
//		Person1
		String country = "India";
		char gender ='F';
		String skill ="Batter";
		
		iseligible = country == "India" && (gender == 'F' || gender ==  'M') && (skill == "Bowler" || skill == "Batter");
//		                t && (t || f ) && (f || t) == t && t && t ==t
		System.out.println(iseligible); 
		
//            Person2
		String country3 = "India";
		char gender3='F';
		String skill3="Keeper";
		iseligible = country3=="India" && (gender3 == 'F' || gender3 == 'M' ) && ( skill3 == "Bowler" || skill3 == "Batter");
		System.out.println(iseligible); 
		
		System.out.println("**** TERNARY OPERATOR****");
		
		int a = 10;
		int b = 24;
//		Find max number from both
		int result = a > b ? a : b;
		System.out.println("max number is: "+result);
		
//		Find min number from both
	    result = a > b ? b : a;
		System.out.println("min number is: "+result);
	}

}
