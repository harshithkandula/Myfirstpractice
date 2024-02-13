import java.util.Date;

interface plan{
	String getPlanName();
	int getPlanPrice();
	void onPurchase(String msg);
	
	default void purchase(int amt) {
		if(amt == getPlanPrice()) {
			System.out.println("Recharge of Plan of amount Rs."+amt+" is successful");
			onPurchase("Plan Activated from "+new Date());
		}
		else {
			System.out.println("Plan Purchase failed");
		}
	}
}class Plan3G implements plan{

	@Override
	public String getPlanName() {
		// TODO Auto-generated method stub
		return "Unlimited 3G data and unlimited calls for 84 days";
	}

	@Override
	public int getPlanPrice() {
		// TODO Auto-generated method stub
		return 599;
	}

	@Override
	public void onPurchase(String msg) {
		// TODO Auto-generated method stub
		System.out.println("[Message]: "+msg);
	}
	
}



class Plan4G implements plan{

	@Override
	public String getPlanName() {
		// TODO Auto-generated method stub
		return "truly unlimited 4g data and calls for duration of 84 days";
	}

	@Override
	public int getPlanPrice() {
		// TODO Auto-generated method stub
		return 999;
	}

	@Override
	public void onPurchase(String msg) {
		// TODO Auto-generated method stub
		System.out.println("[Message]: "+msg);	
		}
	
}

class Plan5G implements plan{

	@Override
	public String getPlanName() {
		// TODO Auto-generated method stub
		return "Unlimited high speed 5G data and unlimited calls for 84 days";
	}

	@Override
	public int getPlanPrice() {
		// TODO Auto-generated method stub
		return 1499;
	}

	@Override
	public void onPurchase(String msg) {
		// TODO Auto-generated method stub
		System.out.println("[Message]: "+msg);
	}
	
}

class PlanFactory{
	public static plan getPlan(int typeOfPlan) {
		plan p = null;
		
		if(typeOfPlan == 3) {
			p = new Plan3G();
		}
		else if(typeOfPlan == 4) {
			p = new Plan4G();
		}
		else if(typeOfPlan == 5) {
			p = new Plan5G();
		}
		else {
			System.out.println("Invalid Plan");
		}
		return p;
	}
}
	
	
public class MobilePlanApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        plan p =PlanFactory.getPlan(5);
        p.purchase(1499);
	}

}
