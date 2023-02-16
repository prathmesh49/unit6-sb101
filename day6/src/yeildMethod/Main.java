package yeildMethod;

public class Main extends Thread {
	@Override
	public void run() {
		String threadName = Thread.currentThread().getName();

		for (int i = 0; i < 10; i++) {
			System.out.println("Excuting " + threadName);
		}
	}

	public static void main(String[] args) {

		Main t1 = new Main();
		Main t2 = new Main();

		t1.setPriority(NORM_PRIORITY + 1);
		t2.setPriority(NORM_PRIORITY + 3);

		t1.start();
		t1.start();
		t1.yield();

		try {
			t1.join();
			t2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		System.out.println("bye bye");

	}

}
