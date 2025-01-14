package com.anisha.thiskeyword.SuperKeyword;
import java.util.*;
public class ProductDelivery {
	
/* usages of "super" keyword : 1. use refer to instance variable
 *                             2. use to refer methods
 *                             3.use to refer constructor */	
    String location ="kothali";   
	String productName;
	double ammount;
    int deliveryDays;
        
//        constructor
        public ProductDelivery( String productName,int deliveryDays, double ammount)
        {
        	this.productName=productName;
        	this.deliveryDays=deliveryDays;
        	this.ammount = ammount;
        }
//        method1
        public void printInfo()
        {
        	System.out.println("Product Name: "+productName);
        	System.out.println("Delivery days: "+deliveryDays);
        }
        
//        method2
        public void productDeliveryRespoence()
        {
        	System.out.println("*****Give Respoence*********");
        	Scanner sc = new Scanner(System.in);
        	String respoence = sc.nextLine();
        	System.out.println("Your respoence to be submitted: "+respoence);
        	
        	
        }
	

}
