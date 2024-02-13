
public class StringToInteg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//construct integer by using a constructor
		Integer n1 = new Integer("999");
		System.out.println(n1);	
		
		//use valueOf method to extract integer value of the string
		String n2 = "9999";
		Integer n3 = Integer.valueOf(n2);
		System.out.println(n3);
		
		//float to string
		Float fn = new Float("33.33");
		String sn = fn.toString();
		System.out.println(sn);
		
		//character classes
		char ch = '0';
		Character c = new Character(ch);
		System.out.println("object value in reference variable c: "+c);
		System.out.println(ch+" is defined character set?: "+Character.isDefined(ch));
		System.out.println("c in lower case: "+Character.toLowerCase(ch));
		System.out.println("c in upper case: "+Character.toUpperCase(ch));
		
		
		}

}
