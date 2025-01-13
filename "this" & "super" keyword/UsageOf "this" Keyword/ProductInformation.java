package com.anisha.thiskeyword;

/*Usage of "this" keyword :1. refers the instance variable : i. constructor body level
                                                           ii.method body level
                           2. this keyword refers methods                               
                           3. this keyword refers to as method arugument  */

public class ProductInformation extends ProdDelivery {

	String productName;
	int prodId;
	double prodAmmount;

//	i. constructor body level
	public ProductInformation(String productName, int prodId, double prodAmmount) {

		this.productName = productName;
		this.prodId = prodId;
		this.prodAmmount = prodAmmount;
	}

//	    ii.method body level & in method 
	public void printProdInfo() {
		System.out.println(this);
		System.out.println("Product name: " + this.productName);
		System.out.println("Product Id: " + this.prodId);
		System.out.println("Product ammount: " + this.prodAmmount);

//		"this" passing as method argument
		this.deliverProd(this);
	}

	public void deliverProd(ProductInformation prod) {
		System.out.println("ProductName: " + prod.productName + "," + "Product Id: " + prod.prodId + ","
				+ "Product ammount: " + prod.prodAmmount);
	}

	public static void main(String[] args) {
		ProductInformation product1 = new ProductInformation("handwash", 7, 223);
		System.out.println(product1);
		product1.printProdInfo();
		ProductInformation product2 = new ProductInformation("Water bottol", 9, 27);
		System.out.println(product2);
		product2.printProdInfo();

	}

}
