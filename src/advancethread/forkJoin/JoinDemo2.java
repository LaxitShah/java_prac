package advancethread.forkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class Sum extends RecursiveTask<Long> {

	int lo; // start
	int high;// end
	int array[]; // array for sum..

	public Sum(int array[], int lo, int high) {

		this.lo = lo;
		this.high = high;
		this.array = array;
	}

	@Override
	protected Long compute() {

		System.out.println("** inside compute...");

		if (high - lo <= 10) {

			System.out.println("## in side if part...");
			long sum = 0l;
			for (int i = lo; i < high; i++) {
				sum += array[i];
			}

			return sum;
		} else {
			System.out.println("inside else part..");
			int mid = lo + (high - lo) / 2;

			Sum right = new Sum(array, lo, mid);

			Sum left = new Sum(array, mid, high);

			System.out.println("before left fork...");
			left.fork();

			System.out.println("before right  fork...");
			right.fork();

			System.out.println("before join..");
			long res = left.join() + right.join();
			System.out.println("after join...");

			return res;
		}
	}

}

public class JoinDemo2 {

	public static void main(String[] args) {

		System.out.println("inside main method...");
		int numbers[] = new int[11];

		for (int i = 0; i < numbers.length; i++) {

			numbers[i] = i;
		}

		ForkJoinPool pool = new ForkJoinPool();
		System.out.println("after pool creation..");
		long ans = pool.invoke(new Sum(numbers, 0, numbers.length));
		System.out.println("after pool invocation...");
		System.out.println("sum = " + ans);

	}
}
