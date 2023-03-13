package com.masai.sprint2.runnable;

public class Main {

	public static void main(String[] args) {
		Runnable r = new newThread();
		Thread t1 = new Thread(r);
		t1.start();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		for(int i=0 ;i <10 ; i++) {
			System.out.println("& ");
		}
		System.out.println("main");
		String name ="prathmesh";
		System.out.println(name.charAt(1));
	}

}

class newThread implements Runnable{

	@Override
	public void run() {
		for(int i=0 ;i <10 ; i++) {
			System.out.println("$ ");
		}
		System.out.println("child");
		
	}
	
}
