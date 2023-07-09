package advancethread.pool3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

class Google implements Runnable {

	int no;

	public Google(int no) {

		this.no = no;
	}

	public void run() {
		for (int i = 1; i <= no; i++) {

			System.out.println(Thread.currentThread().getName() + ".." + i);

		}
	}

}

public class CacheThreadPoolDemo {

	public static void main(String[] args) {

		ExecutorService service = Executors.newCachedThreadPool();

		System.out.println(System.currentTimeMillis());

		Thread t1 = new Thread(new Google(2000));
		Thread t2 = new Thread(new Google(3000));

		try {

			service.submit(t1);
			System.out.println(Thread.currentThread().getName());
			//t1.join();
			//yield ... main...
			Thread.sleep(200);
			service.submit(t2);

		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			service.awaitTermination(1, TimeUnit.SECONDS);

			System.out.println(System.currentTimeMillis());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		service.shutdown();

	}
}
