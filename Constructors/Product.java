package constructor;

/* Requirement : Print Product name , Price , Category */
public class Product {
	String name;
	double price;
	String category;

//      Parametrized Constructor
	public Product(String fname, double ammount, String type) {
		name = fname;
		price = ammount;
		category = type;
	}

	public static void main(String[] args) {

//		ceating object of Parametrized Constructor

		/*
		 * p1.name="laptop"; p1.price=56000; p1.category="electronics";
		 * 
		 * p2.name="headphones"; p2.price=54; p2.category = "accessories";
		 */

		Product p1 = new Product("Laptop", 75000, "Electronics");
		Product p2 = new Product("Headphones", 1500, "Accessories");

		System.out.println("Product name: " + p1.name);
		System.out.println("Product Price: " + p1.price);
		System.out.println("Product Category: " + p1.category);

		System.out.println("Product name: " + p2.name);
		System.out.println("Product Price: " + p2.price);
		System.out.println("Product Category: " + p2.category);
	}

}
