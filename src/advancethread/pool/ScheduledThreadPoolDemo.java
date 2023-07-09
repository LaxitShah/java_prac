package advancethread.pool;

import java.util.Date;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

class Tickets implements Runnable {

	String name;

	public String getName() {
		return name;
	}

	public Tickets(String name) {

		this.name = name;
	}

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getName()+"printing :" + name + "current seconds" + new Date().getSeconds());

	}

}

/*
 * fix
 * cache
 * sche
 * single
 * custome 
 * */
public class ScheduledThreadPoolDemo {

	public static void main(String[] args) {
		
		
		ScheduledExecutorService service = Executors.newScheduledThreadPool(2);
		
		Tickets tickets1 = new Tickets("tr 1");
		Tickets tickets2 = new Tickets("tr 2");
		
		
		
		service.scheduleWithFixedDelay(tickets1, 0, 5, TimeUnit.SECONDS);
		
		
		
	}
}
