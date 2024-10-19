// How to Pass Arguments --->
public class Arguments {
    public static void main(String[] args) {
        int result = printAddition(56, 90);
        System.out.println(result);
        result = printAddition(89, 56);
        System.out.println(result);
        printNmaeAndEmail("Anisha", "patilanisha55@gamil.com");
    }

    public static int printAddition(int a, int b) {
        return a + b;
    }

    public static void printNmaeAndEmail(String name, String email) {
        System.out.println(name);
        System.out.println(email);

    }
}