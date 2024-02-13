package CollectionsFramework;

import java.util.ArrayList;

class Product{
	
	int pid;
	String name;
	int price;
	int quantity;
	
	public Product() {
		
	}

	public Product(int pid, String name, int price, int quantity) {
		super();
		this.pid = pid;
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", name=" + name + ", price=" + price + ", quantity=" + quantity + "]";
	}
	
	
}

class User{
	String name;
	String email;
	String phone;
	
	ArrayList<Product> cart;
	
	public User() {
		
	}

	public User(String name, String email, String phone) {
		
		this.name = name;
		this.email = email;
		this.phone = phone;
		cart = new ArrayList<Product>();
	}
	
	void addToCart(Product product) {
		product.quantity++;
		cart.add(product);
	}
	
	void increment() {
		
	}
	
	void decrement() {
		
	}
	
	void removeFromProduct(Product product) {
		product.quantity--;
		int idx = cart.indexOf(product);
		cart.remove(idx);
	}
	
	void showProductsInCart() {
		
		System.out.println("Products added by "+name);
		for(Product product: cart) {
			System.out.println(product);
		}
		System.out.println();
	}
	
	void checkOutFromCart() {
		int total = 0;
		
		System.out.println("checking out for "+name);
		for(Product product: cart) {
			System.out.println(product);
			total+=(product.price*product.quantity);
		}
		
		System.out.println("Total Payment: "+total);
		System.out.println("Dear "+name+". Please pay Rs."+total);
	}
	
}
public class ShoppingCart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Product p1 = new Product(1,"Samsung OLED", 200000, 0);
		Product p2 = new Product(2, "LG OLED", 140000, 0);
		Product p3 = new Product(3, "Samsung A15", 17000, 0);
		Product p4 = new Product(4, "Puma Sportz shoes", 3000, 0);
		Product p5 = new Product(5, "H.P Laptop", 50000, 0);
		Product p6 = new Product(6, "Boat ear pads", 2000, 0);
		
		
		User u1 = new User("Kandula Harshith", "hkandula@gmail.com", "9515731301");
		User u2 = new User("Srinivas Naredla", "cnunaredla@gmail.com", "9899190269");
		User u3 = new User("Suman Naredla", "sumannaredla@gmail.com", "9899752713");
		User u4 = new User("John Slot", "slotjohn121@gmail.com", "9989001232");
		
		u1.addToCart(p4);
		u1.addToCart(p6);
		
		u2.addToCart(p1);
		u3.addToCart(p5);
		
		u4.addToCart(p2);
		u4.addToCart(p3);
	}

}
