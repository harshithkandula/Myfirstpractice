class Dish{
	String name;
	int price;
	int quantity;
	
	static int numberOfDishes = 0;
	static int totalQuantity;
	
	public Dish() {
		name = "Malaysia Chicken";
		price = 250;
		quantity = 2;
		totalQuantity+=quantity;
		numberOfDishes++;
	}
	public Dish(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		totalQuantity+=quantity;
		numberOfDishes++;
	}
	
	void setDishDetails(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity =quantity;
		
	}
	
	void showDishDetails() {
		System.out.println("Dish details: "+name+" "+price+" "+quantity);
	}
	
	static void noOfDishes() {
		System.out.println("Number Of Dishes: "+numberOfDishes);
		System.out.println("Total Quantity: "+totalQuantity);
	}
	
	void incrementQuantity() {
		quantity++;
		totalQuantity++;
	}
	void decrementQuantity() {
		quantity--;
		totalQuantity--;
	}
	
	
	
	
	
}
public class StaticVsNs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dish d1 = new Dish();
		Dish d2 = new Dish("Apollo Fish",350,2);
		Dish d3 = new Dish();
		Dish d4 = new Dish();
		
		//System.out.println("Dish Details: "+d1.quantity+" details");
		d1.decrementQuantity();
		
		System.out.println(d1.name+" "+d1.price+" "+d1.quantity);
		
		//System.out.println("Dish Details: "+d2.quantity+" plates ordered");
		d2.incrementQuantity();
		System.out.println(d2.name+" "+d2.price+" "+d2.quantity);
		System.out.println(d2.numberOfDishes);
		
		d3.setDishDetails("Chciken Dum Biryani", 200, 1);
		System.out.println("~~~~~~~~~~~~~~~~~~");
		System.out.println("Dish Name      Price");
		System.out.println(d3.name+" "+d3.price);
		
		d4.showDishDetails();
		Dish.noOfDishes();
	}

}
