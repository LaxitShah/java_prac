package advancethread.pool1;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Gmail implements Runnable {

	long no;

	public Gmail(long no) {

		this.no = no;
	}

	public void run() {

		System.out.println(Thread.currentThread().getName() + "..is Reading Mail..At .." + System.currentTimeMillis());

		for (int i = 1; i <= no; i++) {

			System.out.println(Thread.currentThread().getName() + ".." + i);
		}

	}

}

public class ScheduledDemo1 {

	public static void main(String[] args) {

		ScheduledExecutorService ser = Executors.newScheduledThreadPool(5);

		System.out.println("Server started..");

		System.out.println(System.currentTimeMillis());

		
		ser.schedule(new Gmail(1500000l), 2, TimeUnit.SECONDS);
		ser.schedule(new Gmail(15), 1, TimeUnit.SECONDS);

		ser.shutdown();
	}

}
