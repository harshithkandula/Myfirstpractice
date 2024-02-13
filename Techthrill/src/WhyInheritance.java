class Product{
	int id;
	String name;
	String description;
	int price;
	String brand;
	
	Product(){
		
	}

	public Product(int id, String name, String description, int price, String brand) {
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.brand = brand;
	}
	
	void showProduct() {
		System.out.println("~~~~~~~~~Show Product Details~~~~~~~~~~~~");
		System.out.println(name);
		System.out.println(id);
		System.out.println("Price: "+price);
		System.out.println("Brand: "+brand);
		System.out.println("Description: ");
		System.out.println(description);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}

class Shoe extends Product{
	String type;
	int[] sizes;
	String[] color;
	
	Shoe(){
		
	}

	public Shoe(int id, String name, String description, int price, String brand, String type, int[] sizes, String[] color) {
		super(id, name, description, price, brand);
		this.type = type;
		this.sizes = sizes;
		this.color = color;
	}
	
	void showShoeDetails() {
		showProduct();
		System.out.println("Type:"+type);
		for(int i=0;i<color.length;i++) {
			System.out.println("Color Avalaible: "+color[i]);
			for(int j=0;j<sizes.length;j++) {
				System.out.println("Sizes Available for "+color[i]+": "+sizes[j]);
			}
		}
	}
	
	
}

class Tv extends Product{
	int[] screenSize;
	String[] color;
	String ledTechnology;
	
	Tv(){
		
	}

	public Tv(int id, String name, String description, int price, String brand, int[] screenSize, String[] color,
			String ledTechnology) {
		super(id, name, description, price, brand);
		this.screenSize = screenSize;
		this.color = color;
		this.ledTechnology = ledTechnology;
	}
	
	void showTvDetails() {
		showProduct();
		System.out.println("Technology version: "+ledTechnology);
		for(int i=0;i<screenSize.length;i++) {
			System.out.println("Screensizes Available: "+screenSize[i]);
			for(int j=0;j<color.length;j++) {
				System.out.println("color avaialble for "+screenSize[i]+": "+color[j]);
			}
		}
	}
	
}

class MobilePhone extends Product{
	int ram;
	int storage;
	String oS;
	
	MobilePhone(){
		
	}

	public MobilePhone(int id, String name, String description, int price, String brand, int ram, int storage,
			String oS) {
		super(id, name, description, price, brand);
		this.ram = ram;
		this.storage = storage;
		this.oS = oS;
	}
	
	void showMobileDetails() {
		showProduct();
		System.out.println("Ram Size: "+ram);
		System.out.println("Storage: "+storage);
		System.out.println("OS version: "+oS);
	}
	
}
public class WhyInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MobilePhone m1 = new MobilePhone();
		m1.showMobileDetails();

	}

}
