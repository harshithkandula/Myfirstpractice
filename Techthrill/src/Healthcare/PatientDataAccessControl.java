package Healthcare;

public class PatientDataAccessControl implements HospitalMgmt{

	@Override
	public void PatientDataAccess(String designation) {
		// TODO Auto-generated method stub
		if(designation.equalsIgnoreCase("Doctor")) {
			System.out.println("Access Patient Health care data ");
			System.out.println("Access Patients personal data");
			System.out.println("Access patients treament data");
		}
		else if(designation.equalsIgnoreCase("Nurse")) {
			System.out.println("Access Patient's Medical prescription");
			System.out.println("Access Patient's Health complications data");
			System.out.println("Record doctor visit data of patient");
		}
		else if(designation.equalsIgnoreCase("Manager")) {
			System.out.println("Access patient treatment details");
			System.out.println("Decide Patient Bill");
			System.out.println("Access patient payment details");
		}
		else {
			System.out.println("Patient Personal Details");
			System.out.println("Patient issue for service in hospital");
		}
	}

}
