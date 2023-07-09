package collection.queue;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueDemo2 {

	public static void main(String[] args) {

		Queue<String> queue = new PriorityQueue<String>();
		queue.add("raj");
		queue.add("parth");
		queue.add("neha");
		queue.add("yashvi");
		queue.add("vijay");
		queue.add("vijay");
		// queue.add(null);
		queue.add("vijay");

		for (String s : queue) {

			System.out.println(s);

		}

		System.out.println("*********************************");

		System.out.println(queue.peek());
		System.out.println("poll--->" + queue.poll()); // null empty

		System.out.println("*********************************");
		for (String s : queue) {

			System.out.println(s);

		}

		System.out.println("*********************************");

		System.out.println("remove -->" + queue.remove());// exception //parth
		System.out.println("element --->" + queue.element());

		queue.offer("ajay");
		System.out.println("*********************************");

		for (String s : queue) {

			System.out.println(s);

		}

		//ds queue...
		//
		System.out.println(queue.remove("vijay"));

		System.out.println("*********************************");

		for (String s : queue) {

			System.out.println(s);

		}
		
		
		
		

	}
}
