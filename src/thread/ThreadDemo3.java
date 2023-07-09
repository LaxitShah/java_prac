package thread;



public class ThreadDemo3 implements Runnable {

	public void run() {

		System.out.println("thread is runnig..."+Thread.currentThread());

	}

	public static void main(String[] args) {

		
		
		ThreadDemo3 thread = new ThreadDemo3();
		
		Thread t1 = new Thread(thread);
		Thread t2 = new Thread(thread);
		Thread t3 = new Thread(thread);
		
		//thread shared object  t1 t2 t3 
		// start  thread
		
		t1.setName("a");
		t2.setName("b");
		t3.setName("c");
		
		
		/*t1.run();
		t2.run();
		t3.run();
		*/
		
		
		/*t1.start();
		t2.start();
		t3.start();
		*/
	
		
	}

}
