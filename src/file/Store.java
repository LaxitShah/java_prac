package file;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;

class Student implements Serializable {

	int id;
	String name;

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}

}

public class Store {

	public static void main(String[] args) {

		Student s1 = new Student(101, "jay");// s1 -->
		Student s2 = new Student(102, "raj");
		try {
			FileOutputStream out = new FileOutputStream("student.ser"); // as a
																		// byte
																		// code..
			ObjectOutputStream objectOutputStream = new ObjectOutputStream(out);
			objectOutputStream.writeObject(s1);
			objectOutputStream.writeObject(s2);
			objectOutputStream.close();

			System.out.println("object is serilied.,...");
			/*
			 * serilization process....
			 * 
			 */

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
