
public class EncapsulationDemo {
	
	private String firstname;
	private String lastname;
	private int age;
	private String rollno;
	
	public void setFirstName(String firstname) {
		this.firstname = firstname;
	}
	
	public String getFirstName() {
		return firstname;
	}
	
	public void setLastName(String lastname) {
		this.lastname = lastname;
	}
	
	public String getLastName() {
		return lastname;
	}
	
	public void setAge(int age) {
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
	public void setRollno(String rollno) {
		this.rollno = rollno;
	}
	
	public String getRollno() {
		return rollno;
	}
	
	public String toString() {
		return getFirstName()+" "+getLastName()+" "+getRollno()+" "+getAge();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		EncapsulationDemo ed = new EncapsulationDemo();
		ed.setFirstName("Harshith");
		ed.setLastName("Kandula");
		ed.setRollno("16311A04T6");
		ed.setAge(21);
		
		System.out.println("Add Student: "+ed);
	}

}
