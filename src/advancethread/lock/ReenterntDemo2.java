package advancethread.lock;

import java.util.concurrent.locks.ReentrantLock;

class Wish {

	ReentrantLock l = new ReentrantLock();

	public void display(String name) {

		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + "***");
		}

		l.lock();

		for (int i = 1; i <= 10; i++) {

			System.out.println("Hello " + name + "  " + i);
		}
		l.unlock();

		for (int i = 1; i <= 3; i++) {
			System.out.println(Thread.currentThread().getName() + "####");
		}

	}

}

class MyThread1 extends Thread {

	Wish w;
	String name;

	public MyThread1(Wish w, String name) {

		this.w = w;
		this.name = name;
	}

	public void run() {

		w.display(name);

	}
}

class MyThread2 extends Thread {

	Wish w;
	String name;

	public MyThread2(Wish w, String name) {

		this.w = w;
		this.name = name;
	}

	public void run() {

		w.display(name);

	}
}

public class ReenterntDemo2 {

	public static void main(String[] args) {

		Wish w = new Wish();
		MyThread1 t1 = new MyThread1(w, "dhoni");
		MyThread2 t2 = new MyThread2(w, "virat");

		t1.start();
		t2.start();

	}
}
