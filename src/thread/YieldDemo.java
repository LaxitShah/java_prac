package thread;

public class YieldDemo extends Thread {

	//t1
	//t2
	
	public void run() {

		System.out.println("cr thread" + Thread.currentThread().getName());
		
		for (int i = 0; i <= 5; i++) {

			Thread.yield();//t1 t2 t1 t2 t3 t1 t2
			System.out.println(Thread.currentThread().getName());

		}
	}

	public static void main(String[] args) {

		YieldDemo t1 = new YieldDemo();
		YieldDemo t2 = new YieldDemo();
		t1.setName("A");
		t2.setName("B");
		t1.start();
		t2.start();

	}
}
