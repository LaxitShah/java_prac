package advancethread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintNo implements Runnable {

	public void run() {

		for (long i = 1; i <= 2000000000; i++) {

			System.out.println(Thread.currentThread().getName() + ".." + i);
		}

	}

}

public class CachedDemo2 {

	public static void main(String[] args) {


		ExecutorService service = Executors.newCachedThreadPool();
		
		service.submit(new PrintNo());
		service.shutdown();

	}

}
