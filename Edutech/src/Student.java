import java.util.Scanner;

public class Student extends Teacher{
	
	Scanner sc = new Scanner(System.in);
	//Attributes (non local scope)
	String name;
	int age;
	String gender;
	String Batch;
	String phno;
	String qualification;
	String Profession;
	boolean inClass;
	
	//Operations
	void studentDetails() {
		System.out.print("Enter Student Name:");
		name = sc.nextLine();
		System.out.print("Enter Age:");
		age=sc.nextInt();
		System.out.print("Enter Student Gender");
		gender = sc.next();
		System.out.print("Enter Student Batch");
		Batch = sc.next();
		System.out.print("Enter Student Phone Number");
		phno = sc.next();
		System.out.print("Enter Qualification:");
		qualification = sc.next();
		System.out.print("Enter Profession:");
		Profession = sc.next();
		
		if(Batch.equalsIgnoreCase("Morning")) {
			
		}
	}
	
	void getStudentDetails(){
		System.out.println(name);
		System.out.println(age);
		System.out.println(gender);
		System.out.println(Batch);
		System.out.println(phno);
		System.out.println(qualification);
		System.out.println(Profession);
	}
	
	
	void takeTest(String name, String Batch) {
		this.name = name;
		this.Batch = Batch;
		System.out.println("Take test "+name+"Batch: "+Batch);
	}
	Student[] satt = new Student[60];
	
	void markAttendance() throws StudentNotPresentException{
		for(int i=1;i<=60;i++) {
			
			System.out.println(satt[i]+"(P/A):");
			String p = sc.nextLine();
			int j=0;
			if(p == "A") {
				
				throw new StudentNotPresentException("Student on unapproved leave");
				
			}
			else {
				j=j+1;
			}
		}
	}
	
	void attendanceQualification() {
		
		System.out.println("Fetch Attendance of"+name+"from Batch:"+Batch);
		System.out.println("No. of Present days:");
		int pd = sc.nextInt();
		int totalNoOfDays = 60;
		float att = (pd/totalNoOfDays)*100;
		
		if(att >= 80 ) {
			System.out.println("Student Qualified for Attendance");
		}
	}
	
	void feePayment(String name) {
		this.name = name;
		System.out.println("Fee Paid by"+name);
	}
	
	

	

}
