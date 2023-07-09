package thread;


import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;

class Data {

	LineNumberReader lr;// instance declartion..
	String word = null;

	public synchronized void read1() {

		int count1 = 0;
		try {
			lr = new LineNumberReader(new FileReader("dictonry"));

			for (int i = 1; i <= 150000; i++) {

				count1++;
				word = lr.readLine();
				System.out.println(word);

			}
			System.out.println(count1);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public synchronized void read2() {
		System.out.println("thread 2 **************");
		int count2 = 0;
		for (int i = 150001; i <= 370000; i++) {

			try {

				count2++;
				word = lr.readLine();
				System.out.println(word);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}
		System.out.println(count2);

	}

}

public class DictonryData {

	public static void main(String[] args) {

		Data d1 = new Data();
		new Thread() {

			public void run() {

				d1.read1();
			}

		}.start();

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		new Thread() {

			public void run() {

				
				d1.read2();
			}

		}.start();

	}

}
