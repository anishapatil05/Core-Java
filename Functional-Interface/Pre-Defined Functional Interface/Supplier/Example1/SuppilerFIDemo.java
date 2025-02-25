package com.anisha.suplier;

import java.util.Random;
import java.util.function.Supplier;

public class SuppilerFIDemo {

	//REQ : Sending 4-digit pin code : Suppiler Pre-Defined Interface
	
	public static void main(String[] args) {
		
		Supplier<String> pinCode = () ->{
			
               Random random = new Random();
               int OTP = 1000 + random.nextInt(9000);
               
               String finalOTP = String.valueOf(OTP);
               
               return finalOTP;
			
		};
		
		System.out.println(pinCode.get());
		System.out.println(pinCode.get());
		System.out.println(pinCode.get());

	}

}
