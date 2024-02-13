package com.estore.main;
import com.estore.app.*;

class  Eone extends Two{
	//One o =new One(); class with default 
	Two t =new Two();
	void show() {
		t.publMthod();
		//t.protMthd();
		//System.out.println(t.b);
	}
}
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Eone e = new Eone();
		
	}

}
