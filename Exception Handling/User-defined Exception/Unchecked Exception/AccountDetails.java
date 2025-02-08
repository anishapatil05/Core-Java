package com.anisha.userdifined.exceptiontype;

import java.util.Scanner;

public class AccountDetails {

  	   public void chekingAccount()
	   {
  		   Scanner sc = new Scanner(System.in);
  		   System.out.println("Enter account number");
  		   long accountNumber = sc.nextLong();
  		   
  		   sc.close();
  		   String accountNum = String.valueOf(accountNumber);
  		   
		   if(accountNum.length() == 12)
		   {
			   System.out.println("Your account number is valid");
		   }else {
			   throw new InvalidCardNumberException("Your Account number is Invalid");
		   }
	   }
	public static void main(String[] args) {
		AccountDetails obj = new AccountDetails();
		try {
			obj.chekingAccount();
		}catch(Exception e)
		{
	          System.out.println(e.getMessage());
		}


	}

}
