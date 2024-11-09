// How to Pass Arguments --->
public class Arguments {
    public static void main(String[] args) {
        // Passing integer Arguments as (56, 90);
        int result = printAddition(56, 90);
        System.out.println(result);

         // Passing integer Arguments as (89, 56);
        result = printAddition(89, 56);
        System.out.println(result);
        
        // Passing String Arguments as ("Anisha", "patilanisha55@gamil.com");
        printNmaeAndEmail("Anisha", "patilanisha55@gamil.com");
    }

    // Method printAddition(int a, int b);
    public static int printAddition(int a, int b) {
        return a + b;
    }

        // Method  printNmaeAndEmail(String name, String email);
    public static void printNmaeAndEmail(String name, String email) {
        System.out.println(name);
        System.out.println(email);

    }
}
