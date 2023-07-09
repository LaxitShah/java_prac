package collection.queue;

import java.util.LinkedList;import org.w3c.dom.ls.LSInput;

public class LinkedListDemo {

	public static void main(String[] args) {

		// bfr java 6 -> linkedlist -->
		//
		LinkedList<String> list = new LinkedList<>();

		list.add("java");
		list.addFirst("c++");
		list.add(0, "c");
		list.addLast("php");

		System.out.println("pop ---->" + list.pop());
		System.out.println(list.peek()); // null
		System.out.println("elem  " + list.element()); // exception
		System.out.println(list.get(0));

		list.set(0, "cpp");
		System.out.println(list.getFirst());// exception
		System.out.println(list.getLast());

		System.out.println(list.poll());
		System.out.println(list.pollLast());// null of empty
		System.out.println(list.pollFirst());
		System.out.println(list.isEmpty());

		list.add("java");
		//list.addFirst("c++");
		list.add(0, "c");
		list.add("c");
		list.add("c");
		list.addLast("php");

		//System.out.println(list.subList(0, 3));
		//System.out.println(list.removeFirst());
		//list.removeFirstOccurrence("c");
		
		//System.out.println(list.remove("c"));
		//list.removeFirstOccurrence("c");
		list.removeLastOccurrence("c");
		
		
		
		
		

		System.out.println("********************");

		for (String s : list) {

			System.out.println(s);
		}

	}
}
