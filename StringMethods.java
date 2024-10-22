// String ---> Pre-defined Methods
public class StringMethods {
    public static void main(String[] args) {
        // 1.toUpperCase()
        String PancardNum="anisha@12345";
        System.out.println(PancardNum.toUpperCase());

        // 2.toLowerCase()
        String name = "Anisha Patil";
        System.out.println(name.toLowerCase());

        // 3.concat(String str)
        String firstname="Anisha";
        String lastname="Patil";
        System.out.println(firstname.concat(" ").concat(lastname));

        // 4. "+" Oprater in String
          int a = 8;
          int b = 1;
          int c = a+b;
          System.out.println("Addition is: "+ c);

        /*  5. Behaviour of "+" in two ways ---> 1. Numric data-type
                                                 2. String data-type     */
          int  num1= 5;
          int  num2 = 1;
          int num3 = num1+num2;
            // In case of Numreic data
            System.out.println(num3);    
          
            // In case of String data-type
          String result = " Addition is: ";
          System.out.println(result+num1+num2); 
          
          System.out.println(num1+num2+result);


    }
}
