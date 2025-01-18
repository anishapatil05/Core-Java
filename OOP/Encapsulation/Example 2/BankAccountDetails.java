package com.anisha.encasulation;

public class BankAccountDetails {

	public void infoFromBankAccount(BankAccount bank) {
		String name = bank.getUsername();

//		this ony for reading
		System.out.println("reading: " + name);

//       updating value
		bank.setusername("anu");
//	     printing updating value
		System.out.println("update value " + bank.getUsername());

		long num = bank.getAccountNumber();
		System.out.println("reading: " + num);

//	 	updating value
		bank.setAccountNum(123455666l);

//	 	printing update value
		System.out.println("update value " + bank.getAccountNumber());

	}

	public static void main(String[] args) {
		BankAccount obj = new BankAccount();
		obj.infoSendToBankAccountDtails();
	}

}
