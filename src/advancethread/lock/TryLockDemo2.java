package advancethread.lock;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;

class MyThread22 extends Thread {

	public MyThread22(String name) {
		super(name);
	}

	static ReentrantLock l = new ReentrantLock();

	public void run() {

		do {

			try {

				if (l.tryLock(5000, TimeUnit.MILLISECONDS)) {
					System.out.println(Thread.currentThread().getName() + "..get lock..");
					Thread.sleep(5000);
					l.unlock();
					System.out.println(Thread.currentThread().getName() + "..relese lock..");
					break;

				} else {

					System.out.println(Thread.currentThread().getName() + "..unable to get lock will try again..");
					

				}

			} catch (InterruptedException e) {

				e.printStackTrace();
			}

		} while (true);

	}
}

public class TryLockDemo2 {

	public static void main(String[] args) {

		MyThread22 t1 = new MyThread22("A");
		MyThread22 t2 = new MyThread22("B");
		MyThread22 t3 = new MyThread22("C");

		t1.start();
		t2.start();
		t3.start();

	}
}
