import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Participants {
    
	int id;
	String name;
	String dob;
	String gender;
	String batch;
	String profession;
	String phno ;
	String address;
	
	public Participants(){
		
	}
	 
	/*@SuppressWarnings("resource")
	void participantDetails(Scanner sc) {
		sc= new Scanner(System.in);
		System.out.println("Enter the Participant Name");
		name = sc.next();
		System.out.println("Enter Date Of Birth");
		dob = sc.next();
		System.out.println("Which batch you prefer to join (M/E):");
		String p = sc.next();
		if(p == "M") {
			batch = "Morning";
		}
		else {
			batch = "Evening";
		}
		System.out.println("Enter your Occupation");
		profession = sc.next();
		
		System.out.println("Enter your Contact Number");
		phno = sc.next();
		
		System.out.println("Enter your permanent Address");
		address = sc.next();
		
		sc.close();
	}*/
	
	public Participants(String name, String dob, String batch, String profession, String phno, String address) {
		this.name = name;
		this.dob = dob;
		this.batch = batch;
		this.profession = profession;
		this.phno = phno;
		this.address = address;
	}

	
	
    
    
    
    
    
    /*public  void addParticipantsToBatch(Participants p) {
    	
    	
    	 p = new Participants();
    	//p.name = name;
    	//p.dob = dob;
    	//p.batch = batch;
    	//p.profession = profession;
    	//p.phno = phno;
    	//p.address = address;
    	
    	if(p.batch == b.batch1) {
    		
				pm.add(p);
			
    	}
    	else {
    		pe.add(p);
    	}
    }*/
    
    
	public String getName() {
		return name;
	}

	public String getDob() {
		return dob;
	}

	public String getBatch() {
		return batch;
	}

	public String getProfession() {
		return profession;
	}

	public String getPhno() {
		return phno;
	}

	public String getAddress() {
		return address;
	}
	
	
}
