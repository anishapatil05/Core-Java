// Example of Static Variables
public class Staticvar {
    // Static Variables
    static String Company_name="Apple";
    static String CEO ="Tim cook";
    // instance var 
      int service_no;
      String product_name;
    
    public static void main(String[] args){
        // Accessing Static variable
         System.out.println(Company_name);
         System.out.println(CEO);

        // Accessing non-static variable
         Staticvar sc = new Staticvar();
         sc.service_no = 6786;
         sc.product_name="IPHONE 16";
         System.out.println(sc.service_no);
         System.out.println(sc.product_name);
    }
}
