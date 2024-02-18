import java.util.ArrayList;
import java.util.Scanner;

public class Gym extends Participants{

	public Gym(){
		
	}
	
	
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		
		String batch;
		System.out.println("Enter the Participant Name");
		String name = sc.next();
		System.out.println("Enter Date Of Birth");
		String dob = sc.next();
		System.out.println("Which batch you prefer to join (M/E):");
		String pref = sc.next();
		if(pref == "M") {
			batch = "Morning";
		}
		else {
			batch = "Evening";
		}
		System.out.println("Enter your Occupation");
		String profession = sc.next();
		
		System.out.println("Enter your Contact Number");
		String phno = sc.next();
		
		System.out.println("Enter your permanent Address");
		String address = sc.next();
		Batch b = new Batch();
		
		Participants p = new Participants(name, dob, batch, profession, phno, address);
		
		if(batch == b.batch1) {
			b.addParticipantsToMorningBatch(p);
		}
		else if(batch == b.batch2) {
			b.addParticipantsToEveningBatch(p);
		}
		
		else {
			System.out.println("No such  batches");
		}
		
		System.out.println("Enter the Batch Name to know the details:");
		String bname = sc.next();
		ArrayList<Participants> pot = b.displayBatchDetails(bname);
		
		for(Participants pt: pot) {
			if(!pot.isEmpty()) {
				System.out.println("Name | Dob | Batch | Profession | Phno | Address ");
	 		    System.out.println(pt.name+" | "+pt.dob+" | "+pt.batch+" | "+pt.profession+" | "+pt.phno+" | "+pt.address);
			}
			else {
				System.out.println("No Participants in "+bname);
			}
			
		}
		
		
		
		
		
		
		
		 
	}

}
