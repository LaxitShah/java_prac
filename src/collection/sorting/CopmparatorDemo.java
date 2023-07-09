package collection.sorting;

import java.util.Comparator;

class Student implements Comparator<Student> {

	int sId;
	String sName;

	public Student(int sId, String sName) {

		this.sId = sId;
		this.sName = sName;
	}

	public int compare(Student o1, Student o2) {

		return o1.sName.compareTo(o2.sName);
	}

}

public class CopmparatorDemo {

	public static void main(String[] args) {
		
		

	}
}
