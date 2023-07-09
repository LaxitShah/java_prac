package doubts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student implements Serializable {

	int sId;
	String sName;

	public Student(int sId, String sName) {

		this.sId = sId;
		this.sName = sName;
	}

}

public class PoojanDoubt {

	ArrayList<Student> students = new ArrayList<>();

	public void signUp() {

		try {
			ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("stu.ser"));

			Scanner sc = new Scanner(System.in);
			System.out.println("pls enter student Id :-");
			int sId = sc.nextInt();

			System.out.println("pls enter student name :-");
			String sName = sc.next();

			students.add(new Student(sId, sName));
/*			for(Student s: students){
				
				System.out.println(s.sName);
			}
*/			out.writeObject(students);
			out.close();
			

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void login() {

		Scanner sc = new Scanner(System.in);

		List<Student> tempstudent = new ArrayList<>();
		ObjectInputStream in;
		try {
			in = new ObjectInputStream(new FileInputStream("stu.ser"));
			tempstudent = (List<Student>) in.readObject();

			 System.out.println("pls enter student name to login");
			 String name = sc.next();
			for (int i = 0; i < tempstudent.size(); i++) {

				Student student = tempstudent.get(i);
				System.out.println(student.sName.equals(name));
				

			}

		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static void main(String[] args) {

		int choice;
		PoojanDoubt p = new PoojanDoubt();

		do {
			Scanner sc = new Scanner(System.in);
			System.out.println("pls enter no1 for add student");
			System.out.println("pls enter no2 for login");
			System.out.println("pls enter your choice");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				p.signUp();
				break;

			case 2:
				p.login();
				break;
			}

		} while (choice != 3);
	}
}
