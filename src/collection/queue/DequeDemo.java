package collection.queue;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeDemo {

	public static void main(String[] args) {

		Deque<String> dq = new ArrayDeque<>();
		dq.add("zarin");
		dq.add("priyanka");
		dq.add("ashish");
		dq.add("manish");
		
		dq.addFirst("rajvi");
		dq.addLast("ankit");
		
		System.out.println("peek"+dq.peek());
		

		for (String s : dq) {

			System.out.println(s);
		}

	}
}
