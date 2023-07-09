package thread;

public class ThreadDemo6 {

	
	public static void main(String[] args) {

		Runnable r = () -> {

			System.out.println("hello");
		};
		r.run();
	}

}
