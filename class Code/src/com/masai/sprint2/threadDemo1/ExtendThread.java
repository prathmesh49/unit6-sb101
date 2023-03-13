package com.masai.sprint2.threadDemo1;

public class ExtendThread extends Thread {
	@Override
	public void run() {
		
		for(int i=0 ;i <10 ; i++) {
			System.out.println(Thread.currentThread().getName());
		}
		
		
	}
	public static void main(String[] args) {
		ExtendThread t1 = new ExtendThread();
		t1.setName("Captain");
		t1.start();
		for(int i=0 ;i <10 ; i++) {
			System.out.println(Thread.currentThread().getName());
		}
	}
}
