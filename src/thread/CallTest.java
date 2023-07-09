package thread;


class call1 {

	synchronized void runnigCall(int code) // waitng 0 1
	{

		System.out.println("call is running...");

		if (code == 0) {

			System.out.println("new call is waiting");
			System.out.println("running call is put on hold..");
			try {
				//Thread.sleep(5000);  //non-runnable
				wait();  //waiting stage
				System.out.println("holded call recive..");
				System.out.println("call ended..");

				// ruunable
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

	
	synchronized void newCall() {

		System.out.println("new call recived...");
		System.out.println("new call running..");
		System.out.println("new call finish.");
		notify();

	}

}

class Thread1 extends Thread{
	
	call1 call1;
	
	
	
	public Thread1(call1 call1) {
		
		this.call1 = call1;
	}



	public void run(){
		
		call1.runnigCall(0);
		
	}
}

class Thread2 extends Thread{
	
	call1 call1;
	
	
	
	public Thread2(call1 call1) {
		
		this.call1 = call1;
	}



	public void run(){
		
		call1.newCall();
		
	}
}

public class CallTest {

	
	public static void main(String[] args) {
		
		
		call1 c1 = new call1();
		Thread1 t1 = new Thread1(c1);
		Thread2 t2 = new Thread2(c1);
		
		t1.start();
		t2.start();
		
		
	}
}
