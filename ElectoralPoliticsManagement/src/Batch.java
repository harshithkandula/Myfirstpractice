import java.util.ArrayList;
import java.util.Scanner;

public class Batch{
       String batch1 = "morning";
       String batch2 = "Evening";
       int noOfParticipants;
       
       //ArrayList<Batch> bmp = new ArrayList<Batch>();
       //ArrayList<Batch> bme = new ArrayList<Batch>();
       public Batch(){
    	   
       }
       
       public Batch(String timingType){
    	   //this.timingType = timingType;
       }
       
       public void displayBatchDetails() {
    	   
    	   Scanner sc = new Scanner(System.in);
    	   Participants p = new Participants();
    	   
    	   System.out.println("Enter the batch type to know the participant details");
    	   String btimings = sc.next();
    	  
    	   if(btimings.equalsIgnoreCase(batch1)) {
    		   
    		   for(Participants b: p.pm) {
        		   
        		   System.out.println("Batch Name: "+btimings);
        		   System.out.println("Name | Dob | Batch | Profession | Phno | Address ");
        		   System.out.println(b.name+" | "+b.dob+" | "+b.batch+" | "+b.profession+" | "+b.phno+" | "+b.address);
        	   }
    	   }
    	   else if(btimings.equalsIgnoreCase(batch2)){
    		  
    		   for(Participants b: p.pe) {
        		   
        		   System.out.println("Batch Name: "+btimings);
        		   System.out.println("Name | Dob | Batch | Profession | Phno | Address ");
        		   System.out.println(b.name+" | "+b.dob+" | "+b.batch+" | "+b.profession+" | "+b.phno+" | "+b.address);
        	   }
    	   }
    	   
    	   else {
    		   System.out.println("No Batches");
    	   }
    	   
    	   sc.close();
    	   
    	  
       }
       
       //Batch bm = new Batch("Morning");
       //Batch be = new Batch("Evening");
       //Participants pt =new Participants();
       
       /*public void addParticipantsToBatch(Batch b, Participants p, Scanner sc) {
    	   boolean addParticipant;
    	   pt.participantDetails(sc);
    	   b = new Batch(pt.getBatch()); 
    	  if( b == bm) {
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
