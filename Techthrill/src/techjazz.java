import java.util.*;
public class techjazz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Car Number");
        String cn=sc.nextLine();
        System.out.println("Enter Vehicle Type");
        System.out.println("Enter Entry Time");
        
        int i = 0, j;
        if(i<=4) {
        	for(i=1;i<=4;i++) {
        		for(j=1;j<=50;j++) {
        			System.out.println("Parking Slot: "+i+j);
        		}
        	}
        }
        else {
        	System.out.println("Parking Full");
        }
	}

}
