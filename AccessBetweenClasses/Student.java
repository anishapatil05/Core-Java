// Accessiblity of  Variabls from different classes(Studentdata)
public class Student {
    // defining static var 
    static String clgname="JJMCOE";
    // defining non-static var 
    int clgcount=890;

       public static void main(String[] anisha){ 
           // Accessing clgname var in same class
           System.out.println(clgname);

           // Accessing clgcount var in same class
           Student s1 = new Student();
           System.out.println(s1.clgcount);
     
             }
}
