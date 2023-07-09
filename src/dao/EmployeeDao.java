package dao;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import bean.EmployeeBean;

//data access object..
public class EmployeeDao {

	public void addEmployee(EmployeeBean employeeBean) {

		//EmployeeBean employeeBean = new EmployeeBean(); //diff hascode
		System.out.println("emp dao hash"+employeeBean.hashCode());
		try {
			BufferedWriter br = new BufferedWriter(new FileWriter("employee.txt", true));
			br.write("\n EMPLOYEE ID :-" + employeeBean.geteId());
			br.write("\n EMPLOYEE NAME :-" + employeeBean.geteName());
			br.write("\n EMPLOYEE SALRY :-" + employeeBean.geteSal());
			br.close();

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
