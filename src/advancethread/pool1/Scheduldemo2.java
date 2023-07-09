package advancethread.pool1;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Yahoo implements Runnable {

	long no;

	public Yahoo(long no) {

		this.no = no;
	}

	public void run() {

		Date d = new Date();
		System.out.println(Thread.currentThread().getName() + "is reading mail..at." + d.getTime());
		for (int i = 1; i <= no; i++) {

			System.out.println(Thread.currentThread().getName() + ".." + i);
		}

	}

}

public class Scheduldemo2 {

	public static void main(String[] args) {

		ScheduledExecutorService ser = Executors.newScheduledThreadPool(5);
		System.out.println("server stared..");

		/*
		 * 5 mill 5 mill
		 * 
		 * 6 mill 11 mill
		 * 
		 * 
		 * 
		 */
		
		ser.scheduleAtFixedRate(new Yahoo(10), 2, 1, TimeUnit.SECONDS);

		System.out.println("*****");

		try {
			ser.awaitTermination(15, TimeUnit.SECONDS);
		} catch (InterruptedException e) { // TODO Auto-generated catch block
			e.printStackTrace();
		}

		ser.shutdown();

	}

}
