package thread;

public class ThreadDemo5  implements Runnable{

	
	public void run() {

		for (int i = 1; i <= 10; i++) {
			System.out.println("running thread is -> " + Thread.currentThread().getName() + "- priority of thread is ->"
					+ Thread.currentThread().getPriority());

		}

	}
	
	//10 gb   read
	//main  -->t1 t2 t3  1 2 3   merge    
	//t1 t2 t3 t4   -->t1 stop t2 t3
	
	//project server   backup  single  singleroject  backend backup

	public static void main(String[] args) {

		ThreadDemo5 t = new ThreadDemo5();
		
		Thread t1 = new Thread(t);
		Thread t2 = new Thread(t);
		Thread t3 = new Thread(t);
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");
		
		//priority    1 to 10
		// 5 normal prio
		//min 1
		//max  10
		
		
		t1.setPriority(Thread.MIN_PRIORITY);  // 1
		t2.setPriority(Thread.MAX_PRIORITY);  // 10
		t3.setPriority(Thread.NORM_PRIORITY); //5

		
		t1.run();
		t2.run();
		t3.run();

	}
	
}
