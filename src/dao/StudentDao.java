package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import bean.StudentBean;

public class StudentDao {

	public void addStudent(StudentBean studentBean) {

		BufferedWriter br;
		try {
			br = new BufferedWriter(new FileWriter("student.txt"));
			br.write("\nstudent roll no =" + studentBean.getSrNo());
			br.write("\n student name =" + studentBean.getsName());
			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
