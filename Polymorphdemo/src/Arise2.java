
public class Arise2 implements MyInterface{
	
	public void display(String msg) {
		System.out.println("Message from Headquarters: "+msg.toUpperCase());
	}
	
	public String getString(String str) {
		return "Hello ".concat(str);
	}

}
