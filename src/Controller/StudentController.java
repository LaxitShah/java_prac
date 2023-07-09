package Controller;

import java.util.Scanner;

import bean.StudentBean;
import dao.StudentDao;

public class StudentController {

	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter studebnt roll no");
		int srNo = sc.nextInt();
		
		System.out.println("pls enter studebnt Name");
		String sName = sc.next();
		
		//file logic... dao
		StudentBean studentBean = new StudentBean();
		
		studentBean.setSrNo(srNo); //101
		
		
		studentBean.setsName(sName);
		StudentDao studentDao = new StudentDao();
		studentDao.addStudent(studentBean);
		
		
		
		
		
	}
}
