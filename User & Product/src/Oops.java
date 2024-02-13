import java.util.Date;

class User{
	String name;
	String phone;
	String email;
	Date db;
	char gender;
	String password;
	
	User(){
		name = "Srihaan M";
		phone = "8008766676";
		email = "srihaan321@gmail.com";
		db = new Date();
		gender = 'M';
		password = "sr1234";
	}
	
	User(String name, String phone, String email, Date db, char gender, String password){
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.db = db;
		this.gender = gender;
		this.password = password;
	}
	
	void setUserDetails(String name, String phone, String email, Date db, char gender, String password) {
		this.name = name;
		this.phone = phone;
		this.email =  email;
		this.db = db;
		this.gender = gender;
		this.password = password;
	}
	
	void displayUserDetails() {
		String sex;
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
		System.out.println(name+" can be called in on "+phone+" and can be mailed at "+email);
		if(gender == 'F') {
			 sex = "Girl";
		}
		else if(gender == 'M') {
			 sex = "Boy";
		}
		else {
			 sex = "Others";
		}
		System.out.println(name+" is a "+sex+" having date of birth on"+db);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
	}
}
public class Oops {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		User u1= new User();
		User u2= new User();
		User u3 = u1;
		User u4 = new User();
		User u5 = new User("Sumavarsha K", "7071899331", "sumavarsha111@gmail.com", new Date(23-03-1998),'F',"suma1234");
		
		u1.name = "Harshith";
		u1.phone = "9515731301";
		u3.email = "hkandula@gmail.com";
		u3.db = new Date(02-05-1998);
		
		//u2.name = "Sreenidhi";
		//u2.phone = "3210075984";
		//u2.email = "nidhi122@gmail.com";
		
		u2.setUserDetails("Nanditha", "9812100374", "Nandu@gmail.com", new Date(12-12-1999), 'F', "hihi1234");
		
		u1.displayUserDetails();
		//System.out.println(u1.name+" can be called in on "+u1.phone+" and can be mailed at "+u1.email);
		System.out.println(u2.name+" can be called in on "+u2.phone+" and can be mailed at "+u2.email);
		System.out.println(u3.name+" can be called in on "+u3.phone+" and can be mailed at "+u3.email);
		System.out.println(u4.name+" can be called in on "+u4.phone+" and can be mailed at "+u4.email);
		System.out.println(u5.name+" can be called in on "+u5.phone+" and can be mailed at "+u5.email);
		
		
		Product p1= new Product();
		
		String tv1 = " sony hx-400 qled\n2 lakh pixels\ngoogle tv\n12 OTT Apps";
		p1.setProductData("Sony HX400", tv1, 4.9, 110000);
		p1.displayProductData();
	}

}
