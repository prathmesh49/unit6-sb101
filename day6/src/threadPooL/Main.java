package threadPooL;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {

	public static void main(String[] args) {
		ExecutorService es = Executors.newFixedThreadPool(3);
		
		Runnable r = ()->{
			String name = Thread.currentThread().getName();
			System.out.println(name);
		};
		
		for(int i=0 ; i<10 ; i++) es.submit(r);
		
		es.shutdown();
		 
	}
	

}
