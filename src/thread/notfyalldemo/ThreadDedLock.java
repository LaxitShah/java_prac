package thread.notfyalldemo;

class Abc{
	
	
}
public class ThreadDedLock {

	
	public static void main(String[] args) {
		
		Abc a = new Abc();
		String name1 = "java";
		String name2 = "python";
		
		Thread t1 = new Thread(){
			
			public void run(){

				
				// name1
				synchronized (name1) 
				{
					
					System.out.println("Thread 1 locked name1");
					
					try {
						Thread.sleep(1500); //name1
						
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					
					
					System.out.println("*****");
				}
				
				synchronized (name1) {
				
					System.out.println("Thread 1 locked name2");
				}
				
			}
			
			
		};
		
		Thread t2 = new Thread(){
			
			
			public void run(){
			
				
				synchronized (name2) {
				
					System.out.println("thread 2 locked name2");
					
				}
				
				synchronized (name1) {
				
						System.out.println("thread 2 locked name1");
				}
				
			}
			
		};
		
		t1.start();
		t2.start();
	}
}
