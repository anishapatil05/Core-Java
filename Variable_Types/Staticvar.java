// Static Variables
public class Staticvar {
    static String Company_name="Apple";
    static String CEO ="Tim cook";
      int service_no;
      String product_name;
    public static void main(String[] args){
         System.out.println(Company_name);
         System.out.println(CEO);
          
         Staticvar sc = new Staticvar();
         sc.service_no = 6786;
         sc.product_name="IPHONE 16";
         System.out.println(sc.service_no);
         System.out.println(sc.product_name);
    }
}
