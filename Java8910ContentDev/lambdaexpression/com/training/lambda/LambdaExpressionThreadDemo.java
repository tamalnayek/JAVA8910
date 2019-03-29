package com.training.lambda;

import java.util.function.IntConsumer;
import java.util.stream.IntStream;

public class LambdaExpressionThreadDemo {
	public static void main(String[] args) {
		new Thread(new Runnable() {
			
			@Override
			public void run() {
				for(int i=0; i<500; i++){
					System.out.println("i value is " + i);
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			}
		}).start();
		
		// with lambda 
	
		new Thread(() -> {
//			IntStream.range(0, 50).forEach(System.out. :: println);
			IntStream.range(0, 50).forEach(new IntConsumer() {
				
				@Override
				public void accept(int value) {
					System.out.println(value);
					
					
					try {
						Thread.sleep(60);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
				}
			});
		}).start();
	
		
	}
}