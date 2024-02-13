
public class OverloadingDemo {
	
	void overloadingMethod(int i) {
		System.out.println("Overloading method with int i -"+i);
	}
	
	void overloadingMethod(int p, String str) {
		System.out.println("overloading method with integer p and string str - "+p+"."+str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverloadingDemo od = new OverloadingDemo();
		od.overloadingMethod(1);
		od.overloadingMethod(1, "K.Harshith");

	}

}
