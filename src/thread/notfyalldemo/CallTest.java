package thread.notfyalldemo;

class call1 extends Thread {

	public void run() {

		synchronized (this) {

			System.out.println("call 1 is running..");
			System.out.println("call  1 is put on hold..");
			try {
				wait();  //wait....
				System.out.println("holded call 1 is recive...");
				System.out.println("call 1 done...");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}

	}

}

class call2 extends Thread {

	call1 call1; //
	
	public call2(call1 call1) {

		this.call1 = call1;
	}

	
	public void run() {

		System.out.println("call2 is stared....");
		//call2 thread..
		synchronized (this.call1) {

			System.out.println("call 2 recived...");
			System.out.println("call 2 is running");
			System.out.println("call 2 is put on hold");
			try {
				this.call1.wait();
				System.out.println("holded call 2 recive..");
				System.out.println("call 2 done..");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

	}

}


class call3 extends Thread {

	call1 call1;

	public call3(call1 call1) {

		this.call1 = call1;

	}

	public void run() {

		synchronized (this.call1) {

			System.out.println("call  3 is recive..");
			System.out.println("call 3 done..");
			
			this.call1.notifyAll();
			
		}
	}

}

public class CallTest {

	public static void main(String[] args) {

		call1 call1 = new call1();
		call2 call2 = new call2(call1);
		call3 call3 = new call3(call1);

		call1.start();
		call2.start();
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		call3.start();

	}

}
