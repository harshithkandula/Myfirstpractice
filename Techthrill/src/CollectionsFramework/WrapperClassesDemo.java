package CollectionsFramework;

public class WrapperClassesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer a = new Integer(100);
		System.out.println(a.floatValue());
		String a1 = "100";
		Integer a2 = Integer.valueOf(a1);
		System.out.println(a2.intValue());
		
		Character  b = new Character('H');
		System.out.println();
		
		//unboxing
		int a3 = a;
		System.out.println(a3);
		
		char c = b;
		System.out.println(c);
		
		
		
		//boxing
		
		Character d = 'A';
	}

}
