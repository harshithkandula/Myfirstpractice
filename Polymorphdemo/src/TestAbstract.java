
public class TestAbstract {
	
	static void callClass(MyInterface ic) {
		ic.display("Mission Accomplished: Enemy Presence- Negative");
		String str = ic.getString("Little brother Not found: Mission still ON");
		System.out.println("Task: "+str);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyInterface ic;
		ic = new Arise1();
		callClass(ic);
		ic = new Arise2();
		callClass(ic);
   
	}

}
