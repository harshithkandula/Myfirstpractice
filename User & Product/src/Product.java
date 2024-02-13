
public class Product {
	
	String name;
	String descript;
	double rating;
    double price;
    
	public Product(String name, String descript, double rating, double price) {
		this.name = name;
		this.descript = descript;
		this.rating = rating;
		this.price = price;
	}

	public Product() {
	}
    
	void setProductData(String name, String descript, double rating, double price) {
		this.name = name;
		this.descript = descript;
		this.rating = rating;
		this.price = price;
	}
	
	void displayProductData() {
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("Product "+name+" is priced at "+price+" has rating at "+rating);
		System.out.println("Description:");
		System.out.println(descript);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
    
    

}
