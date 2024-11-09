// Example of :  Accessibilty of variables from different classes
public class Studentdata {
    public static void main(String[] args) {
        // Accessing static variable clgname of Student class...
        String name = Student.clgname;
        System.out.println(name);

         // Accessing non-static variable clgcount of Student class...
        Student s1 = new Student();
        System.out.println(s1.clgcount);
    }
}
