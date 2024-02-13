
public class ThrowExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThrowExample t = new ThrowExample();
		try {
			t.display();
		}
		catch(NullPointerException nExp) {
			System.out.println("Exception caught in main method");
			nExp.printStackTrace();
		}
	}
	
	void display() {
		try {
			throw new NullPointerException();
		}
		catch(NullPointerException nExp){
			System.out.println("Exception caught in method");
			throw nExp;
			}
	}

}
