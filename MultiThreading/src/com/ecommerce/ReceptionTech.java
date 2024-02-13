package com.ecommerce;

import Healthcare.Doctor;

public class ReceptionTech extends Thread{
	
	Doctor d;
	public ReceptionTech(Doctor d) {
		this.d = d;
	}
	
	public void run() {
		//This thread's job is to print numbers from 1 to 10
		//which are the token numbers of the outpatients
		System.out.println("Current thread excuting in CPU: "+Thread.currentThread().getName());
		for (int i=1;i<=10;i++) {
			System.out.printf("[%s ] Calling Patient No %s, please report to the reception \n",Thread.currentThread().getName(), i );
			//System.out.printf("Calling Patient No. %s, please report to the doctor \n", +i);
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
			
		}
		synchronized(this) {
			for (int j=1;j<=10;j++) {
				System.out.printf("[%s ] Calling Patient No %s, please report to the reception j \n",Thread.currentThread().getName(), j );
				//System.out.printf("Calling Patient No. %s, please report to the doctor \n", +j);
				
				try {
					Thread.sleep(1000);
				}
				catch(Exception e) {
					
				}
				
			}
		}
	}
}
