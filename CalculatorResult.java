// Accessing methods from differnt class 
// Accessing methods from calculator class
public class CalculatorResult {
  public static void main(String[] args) {
    // Accessing Static Addition method of calculator class
       int result =Calculator.addition(78, 9);
       System.out.println(result);

   // Accessing non-static sub method of calculator class
      Calculator c = new Calculator();
       result = c.sub(8, 3);
       System.out.println(result);

       CalculatorResult CR = new CalculatorResult();
       CR.printsubtractionResult();
  }  
  public void printsubtractionResult()
  {
    // Accessing non-static method of calculato class
      Calculator c1 = new Calculator();
      int result=c1.sub(7, 1);
      System.out.println(result);

  }
}
