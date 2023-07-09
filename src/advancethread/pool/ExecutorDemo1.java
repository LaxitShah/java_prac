package advancethread.pool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class PrintJob extends Thread {

	String name;

	public PrintJob(String name) {

		this.name = name;
	}

	public void run() {

		System.out.println(name + "..is print by this thread..." + Thread.currentThread().getName());

	}
}

public class ExecutorDemo1 {

	public static void main(String[] args) {

		ExecutorService service = Executors.newFixedThreadPool(3);
		PrintJob[] jobs = { new PrintJob("samir"), new PrintJob("raj"), new PrintJob("parth"), new PrintJob("akshay"),
				new PrintJob("jay"), new PrintJob("jayraj"), new PrintJob("jayna"), new PrintJob("ajay"),new PrintJob("deven") };

		for (PrintJob p : jobs) {

			service.submit(p);
		}
		service.shutdown();

	}
}
