package com.anisha.enumeration.ex;

public class Mails {

     public enum Gmails{
		
    	 INBOX,COMPOSE,SENT;
	}
     public static void main(String[] args) {
		 Gmails[] gg = Gmails.values();
		 
		 for(Gmails g : gg) {
			 System.out.println(g);
		 }
	}
	
}
