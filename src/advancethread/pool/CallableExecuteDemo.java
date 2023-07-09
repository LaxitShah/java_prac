package advancethread.pool;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
/*
 * set name in thread....
 * */

class MyCallable implements Callable {

	public Object call() throws Exception {

		System.out.println(
				Thread.currentThread().getName() + "...is responisble to find sum of first " + num + " numbers");
		int sum = 0;
		
		for (int i = 0; i <= num; i++) {

			sum = sum + i;
		}
		return sum;
	}

	 int num; //m1,m2

	public MyCallable(int num) {

		System.out.println("const called...");
		this.num = num;
		System.out.println(num);

	}

}

public class CallableExecuteDemo {

	public static void main(String[] args) {

		MyCallable[] jobs = { new MyCallable(100), new MyCallable(22), new MyCallable(500), new MyCallable(78),
				new MyCallable(720), new MyCallable(5) };

		ExecutorService service = Executors.newFixedThreadPool(3);// start
																	// t1,t2,t3

		//MyCallablec m1 = new MyCallable(150);
		//MyCallablec m2 = new MyCallable(150);
		
		//serivce
		for (MyCallable job : jobs) {

			Future f = service.submit(job); // t1 t2 t3 t1 t2 t3
			
			try {

				System.out.println(f.get());

			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (ExecutionException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

		service.shutdown();

	}

}
