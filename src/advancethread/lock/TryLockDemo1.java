package advancethread.lock;

import java.util.Scanner;
import java.util.concurrent.locks.ReentrantLock;

class MyThread extends Thread {

	static ReentrantLock l = new ReentrantLock(); //

	public MyThread(String name) {

		super(name);
	}

	public void run() {

		// thread...
		// if lock is available..

		if (l.tryLock()) {

			System.out.println(Thread.currentThread().getName() + "...is performing Thread Safe operation..");

		} else {

			System.out.println(
					Thread.currentThread().getName() + "..is unable to ge lock and performing alternative operation..");

		}

	}

}

public class TryLockDemo1 {

	public static void main(String[] args) {

		MyThread t1 = new MyThread("A"); // 1 kalak relese..
		MyThread t2 = new MyThread("B"); // else 1.5 kalak
		MyThread t3 = new MyThread("C");// false

		t1.start();
		t2.start();
		t3.start();
	}
}
