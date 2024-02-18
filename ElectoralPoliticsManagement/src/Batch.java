import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class Batch{
       String batch1 = "morning";
       String batch2 = "Evening";
       //int noOfParticipants;
       String batchName;
       String batchId;
       String timings;
       int strength;
       Date startdate;
       
       public Batch(){
    	   
       }
       
      
       
       public Batch(String batchName, String batchId, String timings, int strength, Date startdate) {
		this.batchName = batchName;
		this.batchId = batchId;
		this.timings = timings;
		this.strength = strength;
		this.startdate = startdate;
	}



	public ArrayList<Participants> addParticipantsToMorningBatch(Participants p) {
     	   

    	  	  ArrayList<Participants> pm = new ArrayList<Participants>();
    	  	  pm.add(p);
    	  	    
    	  	   return pm;
    	     }
    	    
    	    public ArrayList<Participants> addParticipantsToEveningBatch(Participants p){
  
    	    	ArrayList<Participants> pe = new ArrayList<Participants>();
    	    	
    	    	pe.add(p);
    	    	return pe;
    	    }
    	    
    	    public  ArrayList<Participants> displayBatchDetails(String bn) {
    	   	   
    	   	   
    	   	   ArrayList<Participants> pal = new ArrayList<Participants>();
    	   	  Participants  po = new Participants();
    	   	  Batch b = new Batch();
    	   	   if(bn.equalsIgnoreCase(batch1)) {
    	   		   
    	   		  pal = b.addParticipantsToMorningBatch(po);
    	   	   }
    	   	   else if(bn.equalsIgnoreCase(batch2)){
    	   		   pal = b.addParticipantsToEveningBatch(po);
    	   		  
    	   	   }
    	   	   else {
    	   		   System.out.println("No Batches");
    	   	   }
    	   	   
    	   	   return pal;
    	 	 }
    	    
    	    
    	    
      
    	   
        /* public  displayBatchDetails() {
    	   
    	   Scanner sc = new Scanner(System.in);
    	   Participants p = new Participants();
    	   
    	   System.out.println("Enter the batch type to know the participant details");
    	   String btimings = sc.next();
    	  
    	   
    	   if(btimings.equalsIgnoreCase(batch1)) {
    		   part = p.pm;
    		   for(Participants b: p.pm) {
        		   
        		   System.out.println("Batch Name: "+btimings);
        		   System.out.println("Name | Dob | Batch | Profession | Phno | Address ");
        		   System.out.println(b.name+" | "+b.dob+" | "+b.batch+" | "+b.profession+" | "+b.phno+" | "+b.address);
        	   }
    	   }
    	   else if(btimings.equalsIgnoreCase(batch2)){
    		  part = p.pe;
    		   /*for(Participants b: p.pe) {
        		  
        		   System.out.println("Batch Name: "+btimings);
        		   System.out.println("Name | Dob | Batch | Profession | Phno | Address ");
        		   System.out.println(b.name+" | "+b.dob+" | "+b.batch+" | "+b.profession+" | "+b.phno+" | "+b.address);
        	   }
    	   }
    	   
    	   else {
    		   System.out.println("No Batches");
    	   }
    	   
    	   sc.close();
    	   
    	  
       }*/
       
       
     
      
       
       /*public ArrayList<Batch> addParticipantsToMorningBatch(Participant p) {
    	   boolean addParticipant;
    	   pt.participantDetails(sc);
    	  ArrayList<Participants> b = new ArrayList<Batch>();
    	  if( p.batch == batch1) {
    		  //ArrayList<Batch> bmp = new ArrayList<Batch>();
    		  
    		  while(Batch bat: bmp) {
    			  p = new Participants(pt.getName(), pt.getDob(), b.timingType, pt.getProfession(), pt.getPhno(), pt.getAddress());
    			  bmp.add(p);
    		  }
    	  }
    	  else {
    		  //ArrayList<Batch> bme = new ArrayList<Batch>();
    		  
    		  for(Batch bat: bme) {
    			  p = new Participants(pt.getName(), pt.getDob(), b.timingType, pt.getProfession(), pt.getPhno(), pt.getAddress());
    			  bme.add(bat);
    		  }
    	  }
    	   
    	   
       }*/
       
     
}
