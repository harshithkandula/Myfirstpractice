abstract class Taxi{
	Taxi(){
		System.out.println("Cab Object Constructed");
	}
	
	abstract void bookTaxi(String source, String destination);
}

class MiniTaxi extends Taxi{
	
	MiniTaxi(){
		System.out.println("Minitaxi object created");
	}
	
	@Override
	void bookTaxi(String source, String destination) {
		// TODO Auto-generated method stub
		System.out.println("Cab Booked from "+source+" to "+destination);
	}
	
}

abstract class Notification{
	abstract void notifyWithMsg(String msg);
}

class User extends Notification{

	@Override
	void notifyWithMsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println("~~~~~~~~~~~~~~~~~~~~~");
		System.out.println("New Notification");
		System.out.println(msg);
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~");
	}
	
}

class YoutubeChannel{
	Notification n;
	void subscribe(Notification nf) {
		n = nf;
	}
	
	void uploadVideo(String name) {
		String msg = "A New Video Uploaded: "+name;
		n.notifyWithMsg(msg);
	}
}

public class AbstractDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Taxi t;
		t = new MiniTaxi();
		t.bookTaxi("Home", "Ashoka Hotel");

		User harshith = new User();
		YoutubeChannel ch = new YoutubeChannel();
		ch.subscribe(harshith);
		ch.uploadVideo("Economic Outlook 2024");
	}

}
