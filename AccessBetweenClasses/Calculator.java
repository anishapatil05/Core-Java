// 1. Creating Calculator class...
public class Calculator {
    public static void main(String[] args) {
        // Accessing static m in same class
        int result = addition(67, 89);
        System.out.println(result);

        //Accessing non-static m in same class 
        Calculator c = new Calculator();
        result =c.sub(56, 4);
        System.out.println(result);
    }
    // addition method
    public static int addition(int a, int b)
    {
        System.out.println("Addition method of calculator class");
        return a+b;
    }
     // sub method
    public int sub(int a, int b)
    {
        System.out.println("Subtraction method of calculator class");
        return a-b;
    }
}
