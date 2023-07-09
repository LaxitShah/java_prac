package advancethread;

class MyThread11 extends Thread {

	public void run() {

	}

}

public class ThreadGroupDemo1 extends Thread {

	public static void main(String[] args) {

		MyThread11 m1 = new MyThread11();
		m1.setName("A");
		m1.start();
		ThreadGroup system = Thread.currentThread().getThreadGroup().getParent();

		Thread[] t = new Thread[system.activeCount()];

		system.enumerate(t);

		for (Thread t1 : t) {

			System.out.println(t1.getName() + "=" + t1.isDaemon());
		}

	}
}
