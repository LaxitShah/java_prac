package advancethread.forkJoin;

import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.RecursiveTask;

class SearchElement extends RecursiveTask<Integer> {

	int arr[];
	int start, end;
	int searchEle;

	public SearchElement(int[] arr, int start, int end, int searchEle) {

		this.arr = arr;
		this.start = start;
		this.end = end;
		this.searchEle = searchEle;
	}

	@Override
	protected Integer compute() {

		int size = end - start + 1;
		if (size > 3) {

			System.out.println("size is grt thn 4 ");
			System.out.println(Thread.currentThread().getName());
			int mid = (end + start) / 2;
			SearchElement task1 = new SearchElement(arr, start, mid, searchEle);
			SearchElement task2 = new SearchElement(arr, start, mid + 1, searchEle);
			task1.fork();
			task2.fork();
			int res = task1.join() + task2.join();
			return res;

		} else {

			return processSearch();
		}
	}

	public Integer processSearch() {

		int count = 0;
		for (int i = start; i < end; i++) {

			if (arr[i] == searchEle) {

				count++;
			}

		}
		return count;
	}

}

public class JoinDemo {

	public static void main(String[] args) {

		int arr[] = { 10, 20, 20, 20, 20, 45, 45, 45, 60, 27, 89, 8963, 25, 89, 1000, 200 };
		int searchEle = 20;
		int start = 0;
		int end = arr.length - 1;

		ForkJoinPool pool = new ForkJoinPool();
		SearchElement task = new SearchElement(arr, start, end, searchEle);
		int result = pool.invoke(task);
		System.out.println("search resutt = " + result);

	}
}
