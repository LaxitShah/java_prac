package Controller;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

import bean.EmployeeBean;
import dao.EmployeeDao;

public class EmployeeController {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("pls enter employee id :-");
		int eId = sc.nextInt();
		System.out.println("pls enter employee name:-");
		String eName = sc.next();
		System.out.println("pls enter employee salary");
		float eSal = sc.nextFloat();

		EmployeeBean employeeBean = new EmployeeBean();

		System.out.println(employeeBean.hashCode()); 
		//set data in employee object..
		employeeBean.seteId(eId);
		employeeBean.seteName(eName);
		employeeBean.seteSal(eSal);

		
		//emp objetcr
		
		// void sum(int a)
		//sum(10)

		EmployeeDao employeeDao = new EmployeeDao();
		employeeDao.addEmployee(employeeBean);

	}

}
