package thread;

class Table1 {

	public void printTable(int no) {

		System.out.println("****");
		
		//t1 t2
		
		synchronized (this) {

			
			for (int i = 1; i <= 10; i++) {

				System.out.println(i + " * " + no + " = " + no * i);
			}
		}

	}
}

public class TableTest {

	public static void main(String[] args) {

		Table1 t = new Table1();
		TableThread1 t1 = new TableThread1(t);
		TableThread2 t2 = new TableThread2(t);
		t1.start();
		t2.start();

	}
}

class TableThread1 extends Thread {

	Table1 t1;

	public void run() {

		t1.printTable(50);

	}

	public TableThread1(Table1 t1) {

		this.t1 = t1;
	}

}

class TableThread2 extends Thread {

	Table1 t1; //

	public TableThread2(Table1 t1) {

		this.t1 = t1;
	}

	public void run() {

		t1.printTable(100);
	}
}
