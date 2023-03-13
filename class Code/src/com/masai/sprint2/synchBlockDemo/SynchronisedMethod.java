package com.masai.sprint2.synchBlockDemo;

public class SynchronisedMethod {

	public static void main(String[] args) {
		A a1 = new A();
		A a2 = new A();
//		A a3 = new A();
		
		B b1 = new B(a1,"Hello");
		B b2 = new B(a1,"World");
		B b3 = new B(a2,"Java");
		
		Thread t1 = new Thread(b1);
		Thread t2 = new Thread(b2);
		Thread t3 = new Thread(b3);
		
		t1.start();
		t2.start();
		t3.start();
		try {
			t1.join();
			t2.join();
			t3.join();
		} catch (InterruptedException e) {
		}
		System.out.println("bye bye main");
	}

}
class A {
	 void printMSG(String name) {
		System.out.print("[ ");
		try {
			System.out.print(name);
			Thread.sleep(100);
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println(" ]");
	}
}
class B implements Runnable{
	A a ;
	String name;
	
	public B(A a, String name) {
		this.a = a;
		this.name = name;
	}

	@Override
	public void run() {
		System.out.println("started: "+Thread.currentThread().getName());
		synchronized (A.class) {
			a.printMSG(name);	
		}
		System.out.println("ended: "+Thread.currentThread().getName());
	}
	
}
