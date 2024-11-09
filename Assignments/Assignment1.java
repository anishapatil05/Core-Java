// Assignment 1 : Passing Arguments
public class Assignment1 {
    public static void main(String[] anisha) {
        
        Assignment1 obj = new Assignment1();
        obj.addition(89.765, 1234l);
    }

    // method addition()
    public void addition(double a, long b) {
        System.out.println("Addition is: ");
        System.out.println(a + b);

        sub(90, 65);

    }
    // method sub()
    public static void sub(int a, int b) {
        System.out.println("Subtraction is: ");
        System.out.println(a - b);
    }
}
