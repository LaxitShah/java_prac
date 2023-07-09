package advancethread;

class MyThreads extends Thread {

	@Override
	public void run() {

		System.out.println(Thread.currentThread().getThreadGroup().getName());
		System.out.println(Thread.currentThread().getThreadGroup().getParent().getName());
	}

}

public class ThreadGroupDemo2 {

	public static void main(String[] args) {

		ThreadGroup pg = new ThreadGroup("Parent T Group");
		ThreadGroup g1 = new ThreadGroup(pg, "Thread Group A");
		ThreadGroup g2 = new ThreadGroup(pg, "Thread Group B");
		
		
		/*
		 * home work...
		 * suspand...
		 * active count...
		 * 
		 * */
		
		

		MyThreads m = new MyThreads();

		Thread t1 = new Thread(g1, m);
		Thread t2 = new Thread(g1, m);
		Thread t3 = new Thread(g1, m);

		Thread tt1 = new Thread(g2, m);
		Thread tt2 = new Thread(g2, m);
		Thread tt3 = new Thread(g2, m);

		t1.setName("A");
		t2.setName("B");
		t3.setName("C");

		tt1.setName("X");
		tt2.setName("Y");
		tt3.setName("Z");

		t1.start();
		t2.start();
		t3.start();

		tt1.start();
		tt2.start();
		tt3.start();
		
		

		// g.activeGroupCount(); "home work task.."

	}
}
