/* Decision Making Statements - 1. if Statement 
                                2. if-else Statements
                                3. nested if-else Statements
                                4. if-else-if Statements       */
       
public class IfStatments {

	public static void main(String[] args) {
		int total_Seats = 80;
		int filled_Seats = 60;
		String city = "Jaysingpur";
		int avgPassPercentage = 85;
		
//		 if Statements 

		if (filled_Seats <= 80) {
			System.out.println("Seats are available");
		}
		
//		if-else Statements
	    if (filled_Seats <= total_Seats) {
			int available_Seats = total_Seats - filled_Seats;
			System.out.println("available seats are: " + available_Seats);
	      	} 
	    else {
			System.out.println("Seats are filled");
		     }  
	    
//	    if-else-if Statements

		if (city == "kernataka") {
			System.out.println("city is kernataka");
		} else if (city == "Pune") {
			System.out.println("city is Pune");
		} else if (city == "Mumbai") {
			System.out.println("city is Mumbai");
		} else {
			System.out.println("city is " + city);
		}
		
		
//         nested if-else Statements
		if (avgPassPercentage >= 60) {
			if (avgPassPercentage >= 75) {
				System.out.println("A Grade");
			} else {
				System.out.println("B Grade");
			}
		} else {
			System.out.println("C Grade");
		}
	}
}
