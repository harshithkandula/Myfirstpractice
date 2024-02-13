import java.util.*;
public class primitivedemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte age = 10;
		age=12;
		
		System.out.println("age variable with byte datatype having value: "+age);
		
		short no = 30500;
		int a = 2147483630;
		long b = 100000000012L;
		long c = b-a*no;
		System.out.println("variable c with long datatype having value: "+c);		
		boolean areFlightsAvailable = true;
		boolean isStockOver = false;
		
		String[] parties = {"BJP","JBNP","BJD","TDP","SAD","JDU"};
		for(int i=0;i<parties.length;i++) {
			System.out.println(parties[i]);
		}

	}

}
