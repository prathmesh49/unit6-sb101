package yeildMethod;

class T1 extends Thread {
	T1(String name) {
		super(name);
	}

	public void run() {
		String name = Thread.currentThread().getName();
		for (int i = 0; i < 10; i++) {
			System.out.println("Executing " + name);
		}
	}
}

public class YieldDemo {
	public static void main(String[] args) {
		T1 t1 = new T1("First");
		t1.setPriority(5);
		T1 t2 = new T1("Second");
		t2.setPriority(10);
		t1.start();
		t2.start();
		t1.yield();
		try {
			t1.join();
			t2.join();
		} catch (InterruptedException ex) {
		}
		System.out.println("Bye Bye");
	}
}
