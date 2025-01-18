package com.anisha.encasulation;

// Example of Encapsulation 
public class BankAccount {

//	private variables
	private String username;
	private long accountNum;

//	making public using get() & set() 
	public String getUsername() {
		return this.username;
	}

	public void setusername(String name) {
		this.username = name;
	}

	public void setAccountNum(long number) {
		this.accountNum = number;
	}

	public long getAccountNumber() {
		return this.accountNum;
	}

	public void infoSendToBankAccountDtails() {
		BankAccount BA = new BankAccount();
		BA.accountNum = 988776554;
		BA.username = "Anisha";

		BankAccountDetails BAD = new BankAccountDetails();
		BAD.infoFromBankAccount(BA);
	}

}
