package advancethread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Data {

	public List<String> data() {

		return new ArrayList<>(Arrays.asList("java", "python", "c++", "c", "ML"));
	}

}

class MyThread extends Thread {

	Data d;

	public MyThread(Data d) {

		this.d = d;
	}

	public void run() {

		d.data();
	}

}

public class ThreadDemo1 {

	static List<String> l = new ArrayList<>();

	public static void main(String[] args) {

		Data d = new Data();
		MyThread t1 = new MyThread(d);
		t1.start();

		new Thread() {

			public void run() {

				l = d.data();
			}
		}.start();

		
		System.out.println(l);

	}
}
