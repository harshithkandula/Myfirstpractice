interface PaymentCallbacks{
	void onSuccess(String msg);
	void onFailure(String msg);
}

/**class Joypay implements PaymentCallbacks{
	public void onSuccess(String msg) {
		System.out.println("Payment Success "+msg);
	}
	public void onFailure(String msg) {
		System.out.println("Payment Failure "+msg);
	}
}*/
public class JointWheel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//PaymentCallbacks p =new Joypay();
		//p.onFailure("Amount of 2000");
		
		PaymentCallbacks p = new PaymentCallbacks() {
			public void onSuccess(String msg) {
				System.out.println("Payment Success "+msg);
			}
			public void onFailure(String msg) {
				System.out.println("Payment Failure "+msg);
			}
		};
		
		p.onSuccess("Amount Of 2000");
		}

}
