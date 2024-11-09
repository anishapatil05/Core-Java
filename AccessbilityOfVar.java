// Accessbility of Variable within same class
public class AccessbilityOfVar {
    static String Company_name = "Apple";
    static String CEO = "Tim cook";
    int service_no;
    String product_name;

    public static void main(String[] anisha) {
        // Accessing static Var
        System.out.println(Company_name);

        // Accessing non-static var
        AccessbilityOfVar Ab = new AccessbilityOfVar();
        Ab.service_no=45;
        System.out.println(Ab.service_no);

        // Accessing non-static method
        AccessbilityOfVar obj = new AccessbilityOfVar();
        obj.product_name ="IPHONE 16";
        System.out.println(obj.product_name);
     }
     public void printcompanydetails()
     {
        // Accessing non-static var
        System.out.println(product_name);
     }
     public static String getCollegeName()
     {
        return  Company_name;
     }

}
