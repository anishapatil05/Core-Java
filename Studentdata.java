// Accessibilty of variables from different classes
public class Studentdata {
    public static void main(String[] args) {
        // Access clg data from Student class
        String name = Student.clgname;
        System.out.println(name);

        Student s1 = new Student();
        System.out.println(s1.clgcount);
    }
}
