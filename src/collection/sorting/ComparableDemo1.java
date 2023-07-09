package collection.sorting;

import java.util.TreeSet;

class Book implements Comparable<Book> {

	int bId;
	String bName;

	public int getbId() {
		return bId;
	}

	public void setbId(int bId) {
		this.bId = bId;
	}

	public String getbName() {
		return bName;
	}

	public void setbName(String bName) {
		this.bName = bName;
	}

	public Book(int bId, String bName) {

		this.bId = bId;
		this.bName = bName;
		System.out.println("bname-" + bName);
	}

	@Override
	// i
	// o nas
	// maslai o
	// musfa
	// 0
	// 0 z
	// z

	public int compareTo(Book o) {

		System.out.println("b name->" + bId);
		System.out.println("o name..." + o.bId);
		if (bId == o.bId) {

			return 0;
		} else if (bId > o.bId) {

			return 1;
		}
		return -1;
	}

}

public class ComparableDemo1 {

	public static void main(String[] args) {

		Book b1 = new Book(101, "ibnebtuti");
		Book b2 = new Book(102, "october junction");
		Book b3 = new Book(103, "abc");

		TreeSet<Book> books = new TreeSet<>();
		books.add(b1); // compareto
		books.add(b2);
		books.add(b3);

		for (Book b : books) {

			System.out.println(b.bId + "-" + b.bName);
		}

	}
}
