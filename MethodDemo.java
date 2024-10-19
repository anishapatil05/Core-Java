public class MethodDemo {
    public static void main(String[] args) {
       long m_num=mobilenum();
       System.out.println(m_num);

       printname();

       double value=anyvalue();
       System.out.println(value);

    }
    public static long mobilenum()
     {
        System.out.println("908765");
        return 908765;
     } 
     public static String printname()
     {
        System.out.println("ANisha Patil");
        return "akp";
     }
     public static  double anyvalue()
     {
        return 89.65;
     }
}
