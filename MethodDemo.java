//  Introduction of Methods....
public class MethodDemo {
    public static void main(String[] args) {
        // method calling
       long m_num = mobilenum();
       System.out.println(m_num);
        // (m_num : 908765 , mobilenum() == 908765 )
    
        printname();
        // (  printname() == "Anisha Patil" || value does't Printed of return type)
        
       double value = anyvalue();
       System.out.println(value);
        // (value: 89.65 )

    }
    // method mobilenum()
    public static long mobilenum()
     {
        System.out.println("908765");
        return 908765;
     } 
      // method printname()
     public static String printname()
     {
        System.out.println("Anisha Patil");
        return "akp";
     }
      // method  anyvalue()
     public static double anyvalue()
     {
        return 89.65;
     }
}
