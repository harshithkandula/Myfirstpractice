import java.util.Calendar;
import java.util.Date;

interface State{
	String getStateName();
	void updateDateTimeStamp(Date date);
	Date getDateTimeStamp();
}

class Placed implements State{

	Date datetimestamp;
	@Override
	public String getStateName() {
		// TODO Auto-generated method stub
		return "Placed";
	}
	@Override
	public void updateDateTimeStamp(Date date) {
		// TODO Auto-generated method stub
		datetimestamp = date;
	}
	@Override
	public Date getDateTimeStamp() {
		// TODO Auto-generated method stub
		return datetimestamp;
	}
	
}

class Shipped implements State{

	Date datetimestamp;
	@Override
	public String getStateName() {
		// TODO Auto-generated method stub
		return "Shipped";
	}
	@Override
	public void updateDateTimeStamp(Date date) {
		// TODO Auto-generated method stub
		datetimestamp = date;
	}
	@Override
	public Date getDateTimeStamp() {
		// TODO Auto-generated method stub
		return datetimestamp;
	}
	
}

class Delivered implements State{

	Date datetimestamp;
	@Override
	public String getStateName() {
		// TODO Auto-generated method stub
		return "Delivered";
	}
	@Override
	public void updateDateTimeStamp(Date date) {
		// TODO Auto-generated method stub
		datetimestamp = date;
	}
	@Override
	public Date getDateTimeStamp() {
		// TODO Auto-generated method stub
		return datetimestamp;
	}
	
}

class Order{
	State s;
	
	Order(){
		s = new Placed();
		s.updateDateTimeStamp(new Date());
	}
	
	State getState() {
		return s;
	}
	
	void updateState(State ns) {
		this.s = ns;
	}
}
public class StateDesignPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Order o = new Order();
		System.out.println("Status of order as of now: "+o.getState().getStateName());
		System.out.println("Time stamp for current state is : "+o.getState().getDateTimeStamp());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		State s = new Shipped();
		s.updateDateTimeStamp(new Date());
		o.updateState(s);
		System.out.println("Status of order: "+o.getState().getStateName());
		System.out.println("Time stamp for current state is: "+o.getState().getDateTimeStamp());
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, 30);
		
		Date date = cal.getTime();
		
		s = new Delivered();
		s.updateDateTimeStamp(date);
		o.updateState(s);
		
		System.out.println("Status of the order: "+o.getState().getStateName());
		System.out.println("Time stamp for current state is: "+o.getState().getDateTimeStamp());
	}

}
