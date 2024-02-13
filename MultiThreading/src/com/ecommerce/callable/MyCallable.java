package com.ecommerce.callable;

import java.util.concurrent.Callable;

public class MyCallable implements Callable<String>{

	@Override
	public String call() throws Exception {
		// TODO Auto-generated method stub
		for (int i=1;i<=10;i++) {
			System.out.printf("[%s ] Calling Patient No %s, please report to the reception \n",Thread.currentThread().getName(), i );
			
			
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				
			}
			
		}
		return "Callable task completed";
	}

}
