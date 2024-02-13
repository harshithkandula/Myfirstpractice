abstract class PayTmPaymentGateway{
	PayTmPaymentGateway(){
		System.out.println("[PayTmPaymentGateway]-object created");
	}
	
	private boolean isBankInterfaceUp = true;
	void pay(int amt) {
		if(isBankInterfaceUp) {
			System.out.println("[Paytm]-Payment of "+amt+" is successfully done");
			onSuccess("[payTM] 101: payment success");
		}
		else {
			System.out.println("[Paytm]- Payment of "+amt+" failed");
			onFailure("[payTM] 201: payment failure");
		}
	}
	  abstract void onFailure(String string);
	abstract void onSuccess(String string);
}

class EasyOrderPayment extends PayTmPaymentGateway{
	EasyOrderPayment(){
		System.out.println("[EasyOrderPayment]-object  created");
	}
	
	void onSuccess(String msg) {
		System.out.println("[EasyOrder]: "+msg);
		System.out.println("[EasyOrder]: Thank you for Placing the order.");
	}
	
	void onFailure(String msg) {
		System.out.println("[EasyOrder]: "+msg);
		System.out.println("[EasyOrder]: Something went wrong");
	}
}
public class PaymentApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EasyOrderPayment e = new EasyOrderPayment();
		
		e.pay(5000);

	}

}
