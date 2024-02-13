
public class Arise1 implements MyInterface{
	public void display(String msg) {
		System.out.println("Message Headquarters: "+msg.concat(" **Confidential**"));
	}
	
	public String getString(String str) {
		return str;
	}
}
