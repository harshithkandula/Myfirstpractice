/* abstract class GPay{
	 void payFromGoogle(int amt){
		 System.out.println("[Google Pay]: Amount paid: "+amt);
		 onFailure(11023, "Payment Unsuccessful");
	 }
	abstract void onSuccess(int code, String msg);
	abstract void onFailure(int code, String msg);
}

abstract class SamsungPay{
	abstract void onSuccess(int code, String msg);
	abstract void onFailure(int code, String msg);
}*/

interface GPay{
	default void payFromGoogle(int amt){
		 System.out.println("[Google Pay]: Amount paid: "+amt);
		 onFailure(11023, "Payment Unsuccessful");
	 }
	abstract void onSuccess(int code, String msg);
	abstract void onFailure(int code, String msg);
}

interface SamsungPay{
	default void payFromSamsung(int amt) {
		System.out.println("[SamsungPay]: Amount Paid"+amt);
		onSuccess(23011, "Payment Successful");
	}
	abstract void onSuccess(int code, String msg);
	abstract void onFailure(int code, String msg);
}

interface Payment extends GPay, SamsungPay{
	
}

class FoodDeliveryPayment implements Payment{

	
	public
	void onSuccess(int code, String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		System.out.println("[FDA]: Payment received!! Your Order will be delivered soon");
		System.out.println("Payment ID: "+code);
		
	}

	public void onFailure(int code, String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg);
		System.out.println("Order ID: "+code);
		System.out.println("[FDA]: Payment Failed!! some error occured. Please try after sometime");
		
	}
	
}
public class FoodDeliveryApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GPay g = new FoodDeliveryPayment();
		g.payFromGoogle(5000);
		
		SamsungPay s = new FoodDeliveryPayment();
		s.payFromSamsung(2500);
		
		FoodDeliveryPayment f = new FoodDeliveryPayment();
		f.payFromGoogle(4500);
		
		f.payFromSamsung(6000);

	}

}
