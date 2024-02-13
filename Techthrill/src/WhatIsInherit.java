class Parent{
	String fname;
	String lname;
	long wealth;
	
	Parent(){
		fname = "Harshith";
		lname = "Kandula";
		wealth = 100000;
		System.out.println("[Parent] - object contructed with default constructor");
	}
	
	void showDetails() {
		System.out.println("[parent] -"+fname+" "+lname+" owns a "+wealth);
	}
	
}

class Child extends Parent{
	
	String fname;
	long wealth;
	String companyName;
	Child(){
		fname = "Aroohi";
		wealth = 5000000;
		companyName = "IBM";
		System.out.println("[child] - object constructed with default constructor");
	}
	
	void showDetails() {
		super.showDetails();
		System.out.println("[child] Details -"+fname+" owns "+wealth+" works at "+companyName);
	}
}
public class WhatIsInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Parent p = new Parent();
		//p.showDetails();
		
		/*Child ch = new Child();
		ch.fname = "Narendra";
		ch.lname = "Modi";
		ch.wealth-=500000;
		ch.showDetails();*/
		
		//Parent p = new Parent();
		//p.showDetails();
		
		Parent p1 = new Child();
		p1.showDetails();
	}

}
