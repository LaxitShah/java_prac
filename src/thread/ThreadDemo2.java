package thread;

public class ThreadDemo2 extends Thread {

	public void run() {

		for (int i = 1; i <= 300; i++) {

			System.out.println(Thread.currentThread().getName() + "-" + i);

		}

	}

	public static void main(String[] args) throws InterruptedException {

		ThreadDemo2 t1 = new ThreadDemo2(); //0
		ThreadDemo2 t2 = new ThreadDemo2(); //1
		ThreadDemo2 t3 = new ThreadDemo2(); //2
		
		
		t1.setName("A");
		t2.setName("B");
		t3.setName("C");

		 
		
		t1.start();
		
		t2.start();//scdular  //bug -->///syncroside  
		
		t2.join();
		
		t3.start();

	}
}
