class CA{
	void show() {
		System.out.println("This is show from CA");
	}
}
class CB extends CA{
	void show() {
		super.show();
		System.out.println("This is show from CB");
	}
	void hello() {
		System.out.println("This si hello from CB");
	}
}
public class PolymorphicStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CA cr;
		cr = new CB();
		
		cr.show();
		
		//cr.hello()- because parent class reference variable cannot access child class non overridden method
		
		CB cb = (CB)cr; //downcasting is parent reference variables is sent into child class reference variable
		
		cb.hello();
	}

}
