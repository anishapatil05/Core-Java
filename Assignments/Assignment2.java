// Assignment 2
public class Assignment2 {
    static String name;
    static char gender;
    double income = 20000;
    double saving = 40000;

    public static void main(String[] args) {
        printdetails("Anisha", 'F');
        Assignment2 obj = new Assignment2();
        obj.printowndetails();
    }
    public static void printdetails(String name, char gender)
    {
        System.out.println(name);
        System.out.println(gender);
    }
    public void printowndetails()
    {
        System.out.println(income);
        System.out.println(saving);
    }

}

