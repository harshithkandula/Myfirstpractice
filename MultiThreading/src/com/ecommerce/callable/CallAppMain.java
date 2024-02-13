package com.ecommerce.callable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class CallAppMain {

	public static void main(String[] args) throws InterruptedException, ExecutionException  {
		// TODO Auto-generated method stub
		Callable<String> myCallable = new MyCallable();
		ExecutorService executor = Executors.newFixedThreadPool(1);
		Future<String> futureResult = executor.submit(myCallable);
		
		for(int i=0;i<10;i++) {
			System.out.printf("Inside main thread i=%s \n",i);
		}
		
		System.out.println("Got a result from myCallable: "+futureResult.get());
	}

}
