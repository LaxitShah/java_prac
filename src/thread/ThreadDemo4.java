package thread;

public class ThreadDemo4 extends Thread {

	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("running thread is -> " + Thread.currentThread().getName() + "- priority of thread is ->"
					+ Thread.currentThread().getPriority());

		}

	}

	public static void main(String[] args) {

		ThreadDemo4 t1 = new ThreadDemo4();
		ThreadDemo4 t2 = new ThreadDemo4();
		ThreadDemo4 t3 = new ThreadDemo4();
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		//priority    1 to 10
		// 5 normal prio
		//min 1
		//max  10
		
		
		t1.setPriority(MIN_PRIORITY);  // 1
		t2.setPriority(MAX_PRIORITY);  // 10
		t3.setPriority(NORM_PRIORITY); //5

		//new call stack...
		// 3 dif call stack 
		//1   2   3
		// chrome  android	
		t1.start();
		t2.start();
		t3.start();
		
		//same call stack..
		//main  -->
	/*	t1.run();
		t2.run();
		t3.run();
*/
	}
}
