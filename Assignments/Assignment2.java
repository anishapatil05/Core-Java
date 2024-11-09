// Assignment 2 : Static & non-static Variables/methods
public class Assignment2 {
    //  static Variables
    static String name;
    static char gender;
    //  non-static Variables
    double income = 20000;
    double saving = 40000;

    public static void main(String[] args) {
        // Calling static method....
        printdetails("Anisha", 'F');
        
        // Calling non-static method....
        Assignment2 obj = new Assignment2();
        obj.printowndetails();
    }
    // static method : printdetails(String name, char gender);
    public static void printdetails(String name, char gender)
    {
        System.out.println(name);
        System.out.println(gender);
    }
    // non-static method :  printowndetails()
    public void printowndetails()
    {
        System.out.println(income);
        System.out.println(saving);
    }

}

