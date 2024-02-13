package com.estore.app;

class One{
	private int a;
	protected int b = 100;
	char v = 'H';
	public String d = "Harshith";
	
	public void publMthod() {
		System.out.println("Public methods can be accessed from class within or outside the package ");
		}
	
	private void privMthd() {
		System.out.println("private methods can be accessed within the class");
	}
	
	void defauMthd() {
		System.out.println("Default methods can be accessed only within the package");
	}
	
	protected void protMthd() {
		System.out.println("Protect access modifier can be accessed within the package and through package level inheritance it can be accessed outside the package");
	}
}

public class App {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		One o = new One();
		o.publMthod();
		o.defauMthd();
		o.protMthd();
		//o.privMthd(); -private method not accessible
		
	}

}
