package com.masai.sprint2.runnable;

public class Main2 {
	public static void main(String[] args) {
		Runnable r = new newThread2();
		Thread t1 = new Thread(r,"IronMan");
		t1.start();
		t1.setPriority(10);
		Thread t2 = new Thread(r,"Thor");
		t2.start();
		t2.setPriority(1);
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		for(int i=0 ;i <10 ; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
	}
}
class newThread2 implements Runnable{

	@Override
	public void run() {
		
		for(int i=0 ;i <10 ; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		
	}
	
}
