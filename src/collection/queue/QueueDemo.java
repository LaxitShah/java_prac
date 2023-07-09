package collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {

		Queue<String> q = new PriorityQueue<>();
		q.add("java");
		q.add("python");
		q.add("c++");
		q.add("android");
		q.add("xyz");
		q.add("pqr");
		q.add("abc");
		q.add("A");
		q.add("xy");
		q.add("m");

		for (String s : q) {

			System.out.println(s);
		}

	}
}
