package com.ecommerce;
import Healthcare.*;
public class PaymentCounter implements Runnable{

	
	//Doctor d = new
	@Override
	public void run() {
		// TODO Auto-generated method stub
		for (int i=1;i<=10;i++) {
			System.out.printf("[%s ] Calling Patient No %s, please report to the payment counter \n",Thread.currentThread().getName(), i );
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
			
		}
		
		synchronized(this) {
			for (int j=1;j<=10;j++) {
				System.out.printf("[For J in counter][%s ] Calling Patient No %s, please report to the payment counter \n",Thread.currentThread().getName(), j );
				
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					
				}
			}
		}
	}

}
