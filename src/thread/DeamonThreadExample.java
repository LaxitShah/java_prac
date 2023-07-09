package thread;

public class DeamonThreadExample extends Thread{

	
	public void run(){
		
		System.out.println(Thread.currentThread().getName()+"--"+Thread.currentThread().isDaemon());
		//System.out.println(Thread.currentThread().getName());
		
	}
	
	public static void main(String[] args) {
		
		
		DeamonThreadExample t1 = new DeamonThreadExample();
		DeamonThreadExample t2 = new DeamonThreadExample();
		DeamonThreadExample t3 = new DeamonThreadExample();
		
		t1.setName("A");
		t1.setDaemon(true);
		t2.setName("B");
		t3.setName("C");
		
		
		t1.start();
		t2.start();
		t3.start();
		
		
		
		
	}
}
