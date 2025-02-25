package com.anisha.consumer;

import java.util.function.Consumer;

public class SendingNotification {

	public static void main(String[] args) {

		ConsumerDetails customer1 = new ConsumerDetails("Shreyash", "Soap", 90, 111);

		Consumer<ConsumerDetails> notification = con -> {

			System.out.println("Hello! " + con.name + " Your ordered Product is " + con.orderName + " having price "
					+ con.orderPrice + " and Id is " + con.orderId);

		};

		notification.accept(customer1);

	}

}
