import java.util.Scanner;

class Cab{
	int baseFare;
	Cab(){
		baseFare = 50;
		System.out.println("Cab Object constructed");
	}
	void bookCab(String from, String to) {
		System.out.println("Cab booked from "+from+" to "+to);
	}
}

class MiniCab extends Cab{
	boolean isStreamingAvailable;
	MiniCab(){
		baseFare+=30;
		isStreamingAvailable = true;
		System.out.println("MiniCab Object created");
	}
	void bookCab(String from, String to) {
		System.out.println("MiniCab booked from "+from+" to "+to);
		System.out.println("Total Fare: "+baseFare);
	}
}

class SharedCab extends Cab{
	int numberOfPeople;
	SharedCab(){
		baseFare-=20;
		numberOfPeople = 4;
		System.out.println("Shared cab object created");
	}
	void bookCab(String from, String to) {
		System.out.println("Shared cab booked from "+from+" to "+to);
		System.out.println("On route, you will share the cab with "+(numberOfPeople-1)+" people.");
		System.out.println("Total Fare: "+baseFare);
	}
}

class LuxuryCab extends Cab{
	int softDrinks;
	int chips;
	LuxuryCab(){
		softDrinks = 2;
		chips = 1;
		baseFare+=30;
		System.out.println("Luxury cab object created");
		}
	
	void bookCab(String from, String to) {
		System.out.println("Luxury Cab Booked from "+from+" to "+to);
		System.out.println("Total Fare "+baseFare);
	}
	
	
}
// Factory Design Pattern
class CabBookingApp{
	static Cab cabBook(int type) {
		Cab c = null;
		
		if(type == 1) {
			c = new MiniCab();
		}
		else if(type == 2) {
			c = new SharedCab();
		}
		else if(type == 3) {
			c = new LuxuryCab();
		}
		else {
			System.out.println("Print a Valid cab");
		}
		
		return c;
	}
}
public class Rtp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/* Cab c;
		c = new Cab();
		c.bookCab("Ashoka Colony", "Balasamudram");
		
		Cab c1;
		c1 = new MiniCab();
		
		c1.bookCab("Raman Study Hall", "Maruthi Driving School");
		
		c1= new SharedCab();
		c1.bookCab("Warangal", "Medaram");*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Select the type of the cab: ");
		System.out.println("1.Mini Cab\t2.Shared Cab\t3.Luxury Cab");
		int t = sc.nextInt();
		Cab c1 = CabBookingApp.cabBook(t);
		c1.bookCab("Mumbai", "Hyderabad");

	}

}
