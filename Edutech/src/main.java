
public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         Student s1 = new Student();
         s1.name = "Harshith";
         s1.age = 25;
         s1.Batch = "Evening";
         s1.gender = "Male";
         s1.qualification = "B.tech";
         s1.Profession = "Engineering Graduate";
         
         s1.attendanceQualification();
         
         Student s2 = new Student();
         s2.name = "Rashmika M";
         s2.age = 29;
         s2.Batch = "Morning";
         s2.gender = "Female";
         s2.qualification = "B.A Arts";
         s2.Profession = "Actress";
         
         s2.feePayment(s2.name);
         
         Student s3 = new Student();
         s3.studentDetails();
         s3.takeTest(s3.name, s3.Batch);
         
         if(s3.gender.equalsIgnoreCase("Male")) {
        	 System.out.println(s3.name+" is a boy");
         }
         else if(s3.gender.equalsIgnoreCase("Female")) {
        	 System.out.println(s3.name+" is a Girl");
         }
         else {
        	 System.out.println(s3.name+" is a Transgender");
         }
         
         switch(s3.Batch) {
         case "Morning":
        	 System.out.println(s3.name+" belongs to Morning Batch");
        	 break;
         case "Evening":
        	 System.out.println(s3.name+" belongs to Evening Batch"); 
        	 break;
         default:
        	 System.out.println(s3.name+" doesnot belong to our institute");
         }
        
         try {
			s3.markAttendance();
		} catch (StudentNotPresentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println(e.getMessage());
		}
        	 
         
	}

}
