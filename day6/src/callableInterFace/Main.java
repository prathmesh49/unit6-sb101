package callableInterFace;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Main implements Callable<Integer> {
	int num;
	

	public Main(int num) {
		super();
		this.num = num;
	}
	@Override
	public Integer call() throws Exception {
		int sum=0;
		for(int i=1 ; i<num ; i++)
			sum+=i;
		
		return sum;
	}

	public static void main(String[] args)throws Exception {
		
		Main arr[] = {new Main(4),new Main(5),new Main(7)};
		
		ExecutorService es = Executors.newFixedThreadPool(5);
		
		for(Main el : arr) {
			
			Future<Integer> f = es.submit(el);
			System.out.println(f.get());
		}
		es.shutdown();
	}


}
