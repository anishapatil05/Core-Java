// Accessiblity of  Variabls from different classes(Studentdata)
public class Student {
    static String clgname="JJMCOE";
     int clgcount=890;

     public static void main(String[] anisha)
     { 
        // Accessing from same class
        System.out.println(clgname);

        Student s1 = new Student();
        System.out.println(s1.clgcount);
     }
}
