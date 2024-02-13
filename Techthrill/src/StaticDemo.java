
public class StaticDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A a1 = new A();
		A a2 = new A();
		
		System.out.println("a1.x value: "+a1.x); //Initially
		System.out.println("a2.x value: "+a2.x);
		
		System.out.println("a1.y value: "+a1.y);
		System.out.println("a2.y value: "+a2.y);
		
		a1.x = 1000;
		
		System.out.println("a1.x value: "+a1.x);
		System.out.println("a2.x value: "+a2.x);
		
		a2.y = 600;
		System.out.println("a1.y value: "+a1.y);
		System.out.println("a2.y value: "+a2.y);
	}

}

class A{
	static int x=100;
	int y=400;
}
