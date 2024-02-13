package Healthcare;
public class Doctor{
	
	public String name;
	public Integer id;
	public String specialization;
	public String timings;
	
	public Doctor(String name, int id, String specialization, String timings){
		this.name = name;
		this.id= id;
		this.specialization = specialization;
		this.timings = timings;
		
		
	}
	//pda.PatientDataAccess(Doctor);
	 public static void main(String args[]) {
		 PatientDataAccessControl pda = new PatientDataAccessControl();
		 String d = "Doctor";
		 pda.PatientDataAccess(d);
	 }

	




	
}

