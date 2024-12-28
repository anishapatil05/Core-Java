package inheritance;

public class MultiLevel2 extends MultiLevel1 {
	
// Perform Multiplication
	public int multi(int a, int b, int c) {
		return a * b * c;
	}

	public static void main(String[] args) {
		MultiLevel2 objLevel2 = new MultiLevel2();
		
//		calling all methods from classes
		System.out.println(objLevel2.add(6, 9, 1));
		System.out.println(objLevel2.sub(9, 6, 5));
		System.out.println(objLevel2.multi(8, 1, 2));
		
		
		
	}

}
