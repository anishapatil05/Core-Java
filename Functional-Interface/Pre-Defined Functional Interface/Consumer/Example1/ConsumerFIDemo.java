package com.anisha.consumer;

import java.util.function.Consumer;

public class ConsumerFIDemo {

	
	//REQ : Calculating EMI value
	
	
	public static void main(String[] args) {

		//public Bank(double ammount, int time, int roi) {
		Bank ICIC = new Bank(45000, 4, 9);
		Consumer<Bank> EMIValue = input -> {

			double monthalyRate = (input.roi / 100.0) / 12;
           double numratorEMI = (input.ammount * monthalyRate *Math.pow(1 + monthalyRate ,input.time));
			
           double denomintorEMI = Math.pow( 1+ monthalyRate, input.time)-1;
           
           double finalEMIValue = numratorEMI / denomintorEMI;
           System.out.println("EMI Ammount is " + finalEMIValue);
		};

		EMIValue.accept(ICIC);

	}

}
