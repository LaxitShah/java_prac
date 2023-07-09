package advancethread.blockingqueue;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

class Producer extends Thread {

	BlockingQueue<Integer> queue;

	public Producer(BlockingQueue<Integer> queue) {

		this.queue = queue;
	}

	public void run() {

		try {
			Random random = new Random();

			int no = random.nextInt(100);
			// System.out.println(Thread.currentThread().getName() + "..is going
			// to slepp");
			//Thread.sleep(1000);//consumer...remove... null..wait...try lock..
			queue.put(no);
			Thread.sleep(1000);//consumer...remove... null..wait...try lock..
			System.out.println("produce ..." + no);

			no = random.nextInt(100);
			// System.out.println(Thread.currentThread().getName() + "..is going
			// to slepp");
			Thread.sleep(1000);
			queue.put(no);
			Thread.sleep(1000);
			System.out.println("produce ..." + no);

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}

class Consumer extends Thread {

	BlockingQueue<Integer> queue;

	public Consumer(BlockingQueue<Integer> queue) {

		this.queue = queue;
	}

	@Override
	public void run() {

		try {
			System.out.println("consume..." + queue.take());
			System.out.println("consume..." + queue.take());

		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}

public class ThreadTest {

	public static void main(String[] args) throws InterruptedException {

		BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(10);

		Producer p = new Producer(queue);
		Consumer c = new Consumer(queue);

		c.start();
		//c.join();
		p.start();

	}
}
