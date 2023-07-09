package advancethread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Greet implements Runnable {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName() + "..");

	}

}

public class PoolDemo4 {

	public static void main(String[] args) {

		Runtime runtime = Runtime.getRuntime();
		int proc = runtime.availableProcessors();
		ExecutorService service = Executors.newFixedThreadPool(proc);
		

	}
}
