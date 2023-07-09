package thread;

class call {

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

public class TestCall {

	public static void main(String[] args) {

		call c = new call();
		
		new Thread() {

			public void run() {

				c.runnigCall(0); // we have waiting thread..
			}

		}.start(); //1

		new Thread() {

			public void run() {

				c.newCall(); // we have waiting thread..
			}

		}.start(); //2

	}

}
