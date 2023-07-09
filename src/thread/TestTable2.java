package thread;

class Table2 {

	public void printTable(int no) {

		System.out.println("****");

		// t1 t2

		synchronized (this) {

			for (int i = 1; i <= 10; i++) {

				System.out.println(i + " * " + no + " = " + no * i);
			}
		}

	}
}

public class TestTable2 {

	public static void main(String[] args) {

		Table2 t = new Table2();

		/*new Thread() {
			public void run() {

				t.printTable(100);
			}

		}.start();*/
		
		//alias
		Thread t1 = new Thread(){
			
			public void run(){
				
				t.printTable(50);
			}
		};
		t1.start();

		new Thread() {
			public void run() {

				t.printTable(50);
			}

		}.start();

	}

}
