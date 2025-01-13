package com.anisha.thiskeyword;

public class ProdDelivery {
	public void deliverProd(ProductInformation prod)
	{
		System.out.println("Prodct is deliverd from station");
		System.out.println("ProductName: "+prod.productName+","+"Product Id: "+prod.prodId+","+"Product ammount: "+prod.prodAmmount);
	}
}
