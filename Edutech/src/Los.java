import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.TreeSet;

public class Los {
	
	public static void demoPriorityQueue() {
		PriorityQueue<Integer> setOfexpenses = new PriorityQueue<Integer>();
		
        setOfexpenses.add(25000);
		setOfexpenses.add(75000);
		setOfexpenses.add(47000);
		setOfexpenses.add(19000);
	}
	public static void demoTreeSet() {
		TreeSet<Integer> setOfexpenses = new TreeSet<Integer>();
		
		
		
		setOfexpenses.add(25000);
		
		
		setOfexpenses.add(75000);
		setOfexpenses.add(47000);
		setOfexpenses.add(19000);
		
		//looping
		Iterator<Integer> i = setOfexpenses.iterator();
		while(i.hasNext()) {
			Integer a =i.next();
			System.out.println(a);
		}
		
		System.out.println("Last Element: "+setOfexpenses.last());
		System.out.println("First Element: "+setOfexpenses.first());
	}
	
	public static void demoHashSet() {
		HashSet<Student> setOfStudents = new HashSet<Student>();
		
		Student s1 = new Student();
		s1.studentDetails();
		setOfStudents.add(s1);
		
		Student s2 = new Student();
		s2.studentDetails();
		setOfStudents.add(s2);
		
		//looping
		Iterator<Student> i = setOfStudents.iterator();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentlist = new ArrayList<Student>();
		
		demoTreeSet();
		
		/*Student s1 = new Student();
		s1.studentDetails();
		studentlist.add(s1);
		
		Student s2 = new Student();
		s2.studentDetails();
		studentlist.add(s2);
		
		for(int i=0;i<=60;i++) {
			Student s = new Student();
			s.studentDetails();
			studentlist.add(s);
		}
		
		System.out.println("No.of students %s \n"+studentlist.size());
	}*/
	
	/**for(Doctor d: listOfDoctors){
	   if(d.age >=30){
	   System.out.println("%s %s \n", d.name d.age);
	   }
       }**/
	}
}
