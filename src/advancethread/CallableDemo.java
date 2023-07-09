package advancethread;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Callable;

class Data1 {

	public List<String> data() {

		return new ArrayList<>(Arrays.asList("java", "python", "c++", "c", "ML"));
	}

}

class MyThread1 implements Callable<List<String>> {

	Data1 d;

	public MyThread1(Data1 d) {

		this.d = d;
	}

	public List<String> call() throws Exception {

		return d.data();
	}

}

public class CallableDemo {

	public static void main(String[] args) throws Exception {

		Data1 d1 = new Data1();
		MyThread1 t1 = new MyThread1(d1);

		List<String> list = (List<String>) t1.call();
		System.out.println(list);



	}
}
