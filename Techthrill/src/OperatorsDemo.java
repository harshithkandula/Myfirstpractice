import java.util.Scanner;

public class OperatorsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double ai = 299999.99;
		double tr = 0.10;
		
		double taxamt = ai * tr;
		double netinc = ai-taxamt;
		System.out.println("Net Income: "+netinc);
		
		int a =10;
		int b = 3;
		
		double r = a/b;
		System.out.println("Result: "+r);
		
		//Assignment Operators & Relational operators
		int eWallet = 120;
		int Buffetcost = 750;
		boolean canihavebuffet = eWallet >= Buffetcost;
		String vpc = "NY24F";
		
		
		System.out.println("Have a Promo: ");
		String pc = sc.next();
		if(canihavebuffet == true) {
			System.out.println("Can i have buffet: Yes");
		}
		else if((canihavebuffet == false) && (vpc.equals(pc))){
			System.out.println("Can i have buffet: Yes");
		}
		else {
			System.out.println("Can i have buffet: No");
		}
		
		int num1 = 8;
		int num2 = 10;
		
		System.out.println("AND OPERATOR: "+(num1 & num2));
		System.out.println("OR OPERATOR: "+(num1 | num2));
		System.out.println("XOR OPERATOR: "+(num1 ^ num2));
		
		//Bitwise Operators
		System.out.println("Right Shift: "+(num2 >> 2));
		System.out.println("Left Shift: "+(num2 << 4));
		
		//unary operators
		int quantity=0;
		int Naan = quantity++;
		int Roti = ++quantity;
		System.out.println("Preincrement result: "+Naan);
		System.out.println("Post Increment Result: "+Roti);
	}

}
