package thread;

///by extending thread class
public class ThreadDemo1 extends Thread {

	public void run() {


		for(int i=0;i<=100000;i++){
		
			System.out.println("hi");
			//System.out.println(i+"-"+Thread.currentThread().getName());
		}
		
		
		// terimate..
	}

	public static void main(String[] args) throws InterruptedException {

		
		//
		

		

		ThreadDemo1 t2 = new ThreadDemo1(); // 2 thread

		ThreadDemo1 t1 = new ThreadDemo1(); // 1 thread

		ThreadDemo1 t3 = new ThreadDemo1();

		t1.setName("A");
		t2.setName("B");
		t3.setName("c");
		

		t1.start();  //2800 
		
		//Thread.sleep(500);  //main  --> 2000 ms t1 1 t0 100000   
		
		

		/*
		 * try { Thread.sleep(2*1000); } catch (InterruptedException e) { //
		 * TODO Auto-generated catch block e.printStackTrace(); }
		 */

		t2.start();
		//Thread.sleep(500);
		
		//Thread.sleep(400);

		/*
		 * try { Thread.sleep(1000); } catch (InterruptedException e) { // TODO
		 * Auto-generated catch block e.printStackTrace(); }
		 */

		t3.start();

	}
}
