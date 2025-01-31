package com.anisha.functional.Interface.lambdaexp;

public class ProductDelivery {

	public static void main(String[] args) {
//	 Product to be : Make / delete / change 
		// Product : productInfo(ProductDetails prod);

//		For Making delivery
		Product makeDelivery = (ProductDetails prod) -> {
			System.out.println("****Product Information****");
			System.out.println(prod);
			System.out.println("Thank You For Choosing Product: " + prod.getName());
		};

//		For Deleting Product
		Product deleteDelivery = (ProductDetails prod) -> {
			System.out.println("****Product Information****");
			System.out.println(prod);
			System.out.println("Send Query why you return this product: " + prod.getName());
		};

//		For updating Product
		Product changeDelivery = (ProductDetails prod) -> {
			System.out.println("****Product Information****");
			System.out.println(prod);
			System.out.println("Your Updated product: " + prod.getName());
		};

		ProductDetails prod1 = new ProductDetails("Soap", 5, 67);
		makeDelivery.productInfo(prod1);

		ProductDetails prod2 = new ProductDetails("Laptop", 54, 90000);
		changeDelivery.productInfo(prod2);

		ProductDetails prod3 = new ProductDetails("Handwash", 8, 90);
		deleteDelivery.productInfo(prod3);

	}

}
