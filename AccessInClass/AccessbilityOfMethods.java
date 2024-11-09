/* Methods: Access calling from & calling one   
            1. Non-Static Method
            2. Static Method      */ 
            
public class AccessbilityOfMethods {

    public static void main(String[] anisha) {
        // static M ---> Accessing Non-static method
        AccessbilityOfMethods obj = new AccessbilityOfMethods();
        int result = obj.addition(20, 59);
        System.out.println(result);

        // Static M---> Accessing static method
        result = sub(89, 43);
        System.out.println(result);

    }

    public int addition(int a, int b) {
        System.out.println("Addition");

        // Non-static M ---> Accessing static method
        int result = mul(89, 4);
        System.out.println(result);
        return a + b;

    }

    public static int sub(int a, int b) {
        System.out.println("Subtraction");
        // Static M---> Accessing Non-static method
        AccessbilityOfMethods obj1 = new AccessbilityOfMethods();
        int result = obj1.Div(76, 4);
        System.out.println(result);
        return a - b;
    }

    public static int mul(int a, int b) {
        System.out.println("Multiplication");
        return a * b;

    }

    public int Div(int a, int b) {
        System.out.println("Division");
        return a / b;
    }
}
