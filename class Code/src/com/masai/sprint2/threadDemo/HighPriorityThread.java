package com.masai.sprint2.threadDemo;

public class HighPriorityThread extends Thread {
	int counter;
	volatile static boolean runme = true;
	
	
	public HighPriorityThread(String name) {
		super(name);
	}

	public void run() {
		while(runme) {
			counter++;
		}
	}

	public static void main(String[] args) {
		System.out.println("hello main thread");
		HighPriorityThread t1 = new HighPriorityThread("hp-t");
		t1.setPriority(NORM_PRIORITY+3);
		
		HighPriorityThread t2 = new HighPriorityThread("lp-t");
		t2.setPriority(NORM_PRIORITY-2);
		
		t1.start();
		t2.start();
		
		try {
			Thread.sleep(5000);
			runme=false;
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.printf("%-10s %-10d\n",t1.getName(),t1.counter);
		System.out.printf("%-10s %-10d\n",t2.getName(),t2.counter);
		

	}

}
