// Using while-loop 

public class Assignment3 {

	public static void main(String[] args) {

//	Task 1:A person should complete 20 rounds of Running track. on every single round completion,Person should say "Hi" 
		int round = 1;
		while (round <= 20) {
			System.out.println(round);
			System.out.println("Hi");
			round++;
		}
//  Task 2: 100 Students : 100 ID'S : 100-200
//           print student id's:

		int id = 100;
		while (id <= 200) {
			System.out.println(id);
			id++;
		}

//  Task 3 : Print 5 division values under the range of 333 to 999

		int n = 2;

		while (n <= 1000) {
			boolean isPrime = true;
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					isPrime = false;
				}
			}
			if (isPrime == true) {
				System.out.println(n);
			}
			n++;

		}
//  Task 4 : Print the 11 divisible numbers between 333 to 888

		int i = 333;
		while (i <= 888) {
			if (i % 11 == 0) {
				System.out.println(i);

			}
			i++;
		}

	}
}
