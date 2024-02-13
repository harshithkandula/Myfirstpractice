interface Notification{
	void notifyMessage(String text);
}
interface ElectricityBillPayment{
	int billAcctNo = 3212110;
	void billGenerated();
	void payBillNotification();
	
}

interface MyInf{
	static void show() {
		System.out.println("This is the from MyInf");
	}
	default void hello() {
		System.out.println("This is hello from Harshith");
	}
	
	void bye();
}

class Rise implements MyInf{
	public void bye() {
		System.out.println("This is bye from Harshith");
	}
}

class ElectricityApp{
	ElectricityBillPayment p;
	void subscribeForBill(ElectricityBillPayment p) {
		this.p = p;
	}
	void broadcastBills() {
		p.billGenerated();
		p.payBillNotification();
	}
}

class Customer implements ElectricityBillPayment{
	public void billGenerated() {
		System.out.println("[user]: Electricity bill Generated: Please Pay in Time");
	}
	public void payBillNotification() {
		System.out.println("[User]: Thank you for paying the bill");
	}
}
public class User implements Notification{

	public void notifyMessage(String text) {
		System.out.println("New Notification: "+text);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(ElectricityBillPayment.billAcctNo);
		Customer c =new Customer();
		ElectricityApp e = new ElectricityApp();
		e.subscribeForBill(c);
		e.broadcastBills();
		Notification n =new User();
		n.notifyMessage("Power Connection blocked due to non payment of dues in given time");
		
		MyInf m = new Rise();
		m.hello();
		m.bye();
		
		MyInf.show();
		
	}

}
