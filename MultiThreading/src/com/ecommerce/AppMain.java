package com.ecommerce;

import Healthcare.Doctor;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Current thread excuting in CPU: "+Thread.currentThread().getName());
		
		Doctor d1 =new Doctor("Harshith", 1001, "Cardiologist", "3:00PM ");
		
		ReceptionTech counter1 = new ReceptionTech(d1);
		counter1.setName("reception counter1");
		counter1.start();
		
		
		ReceptionTech counter2 = new ReceptionTech(d1);
		counter2.setName("Reception counter2");
		counter2.start();
		
		PaymentCounter pco = new PaymentCounter();
		Thread Paymentcounter1 = new Thread(pco);
		Paymentcounter1.setName("Payment Counter1");
		Paymentcounter1.start();
		
		/*for(int i=0;i<10;i++) {
			System.out.printf("Inside main thread i=%s \n",i);
		}*/
	}

}
