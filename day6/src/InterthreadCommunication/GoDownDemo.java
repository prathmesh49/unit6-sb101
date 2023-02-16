package InterthreadCommunication;

class GoDown {
	static boolean isGoDownFull; // initial state is false

	synchronized void getItem() {
		System.out.println("getitem");
		if (isGoDownFull == false) {
			try {
				System.out.println("consumer is waiting");
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println("Item consumed by the consumer");
		isGoDownFull = false;
		notify();

	}

	synchronized void putItem() {
		System.out.println("putitem");
		if (isGoDownFull) {
			try {
				System.out.println("producer is waiting");
				wait();
			} catch (InterruptedException e) {

			}
		}
		System.out.println("Item produced by the producer");
		isGoDownFull = true;
		notify();

	}
}

class Producer implements Runnable {
	GoDown goDown;

	public Producer(GoDown goDown) {
		this.goDown = goDown;
	}

	@Override
	public void run() {
		goDown.putItem();
	}
}

class Consumer implements Runnable {
	GoDown goDown;

	public Consumer(GoDown goDown) {
		this.goDown = goDown;
	}

	@Override
	public void run() {
		goDown.getItem();
	}
}

public class GoDownDemo {

	public static void main(String[] args) {
		GoDown goDown = new GoDown();
		Producer producer = new Producer(goDown);
		Consumer consumer = new Consumer(goDown);
		Thread proThread = new Thread(producer);
		Thread conThread = new Thread(consumer);
		proThread.start();
		conThread.start();
		try {
			proThread.join();
			conThread.join();
		} catch (Exception e) {
		}
		System.out.println("bye bye");
	}

}
