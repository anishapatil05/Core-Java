// Example of Instance Variable
public class InstanceVar {
    // non-static Variable
    String name;
    int roll_no;
    int age;
    public static void main(String[] args)
    {
        // Accessing non-static Variable
        InstanceVar iVar = new InstanceVar();
        iVar.name="Anisha";
        System.out.println(iVar.name);
        
        // give default values of data-type int 
        System.out.println(iVar.roll_no);
        System.out.println(iVar.age);
        
    }

}
