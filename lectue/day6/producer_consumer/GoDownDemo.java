package day6.producer_consumer;


class GoDown{
	static boolean isGoDownFull;
	
	synchronized void getItem() {
		if(!isGoDownFull) {
			try {
				System.out.println("No item in go down, consumer is waiting");
				wait();				
			}catch(InterruptedException ex) {
				
			}
		}
		System.out.println("Item taken from Go-down");
		isGoDownFull = false;
		notify();
	}
	
	synchronized void putItem() {
		if(isGoDownFull) {
			try {
				System.out.println("Go down is full, producer is waiting");
				wait();				
			}catch(InterruptedException ex) {
				
			}
		}
		System.out.println("Put item to Go-down");
		isGoDownFull = true;
		notify();
	}
}
class Consumer implements Runnable{
	GoDown goDown;
	
	public Consumer(GoDown goDown) {
		this.goDown = goDown;
	}
	public void run() {
		goDown.getItem();
	}
}
class Producer implements Runnable{
	GoDown goDown;
	
	public Producer(GoDown goDown) {
		this.goDown = goDown;
	}
	public void run() {
		goDown.putItem();
	}
}
public class GoDownDemo {
	public static void main(String[] args) {
		GoDown goDown = new GoDown();
		Consumer con = new Consumer(goDown);
		Producer pro = new Producer(goDown);
		Thread conThread = new Thread(con);
		Thread proThread = new Thread(pro);
		proThread.start();
		conThread.start();
		try {
			conThread.join();
			proThread.join();
		}catch(InterruptedException ex) {
			
		}
		System.out.println("bye bye");
	}
}