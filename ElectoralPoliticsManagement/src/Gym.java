import java.util.Scanner;

public class Gym{

	public Gym(){
		
	}
	public static Gym g = new Gym();
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Batch b3 = new Batch();
		
		Participants p = new Participants();
		Scanner sc = new Scanner(System.in);
		
		while(!false) {
		p.participantDetails(sc);
		p.addParticipantsToBatch();
		
		
		b3.displayBatchDetails();
		
		
		}
		
		
	}

}
