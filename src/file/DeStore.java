package file;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;

public class DeStore {

	public static void main(String[] args) {

		/*
		 * deserilze
		 */

		try {
			FileInputStream fin = new FileInputStream("student.ser");
			ObjectInputStream input = new ObjectInputStream(fin);
			Student s2 = (Student) input.readObject();
			Student s3 = (Student) input.readObject();
			// Employee e1 = input.readObject();
			System.out.println(s2.id);
			System.out.println(s2.name);

			System.out.println("----------------------");
			System.out.println(s3.id);
			System.out.println(s3.name);

			System.out.println("data deserized....");
			input.close();

		} catch (IOException | ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
