package thread;

//shared object
class Table {

	synchronized void printTable(int no) {

		System.out.println("***");
		for (int i = 1; i <= 10; i++) {

			System.out.println(no + "*" + i + " = " + no * i);
		}

	}
}

class MyThread1 extends Thread {

	Table t; // instance ... *new object null

	//
	public MyThread1(Table t) {

		this.t = t;

	}

	public void run() {

		t.printTable(100); // nullpointer
	}

}

class MyThread2 extends Thread {

	Table t; // instance ... *new object null

	//
	public MyThread2(Table t) {

		this.t = t;

	}

	public void run() {

		t.printTable(500); // nullpointer
	}

}

public class TestTable {

	public static void main(String[] args) {

		StringBuffer sb = new StringBuffer();  //thread safe programming...
		StringBuilder s1 = new StringBuilder();//thread unsafe programming 
		
		Table t = new Table();
		MyThread1 t1 = new MyThread1(t);
		MyThread2 t2 = new MyThread2(t);
		
		
		
		t1.start();
		//waiting  queue...fifo
		//bank 1 ex 2 
		t2.start();
		

	}

}
