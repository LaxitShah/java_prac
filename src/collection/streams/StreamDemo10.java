package collection.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

class Employee {

	int eId;
	String eName;
	float eSalary;

	public Employee(int eId, String eName, float eSalary) {

		this.eId = eId;
		this.eName = eName;
		this.eSalary = eSalary;
	}
	
	public int geteId() {
		return eId;
	}

	public void seteId(int eId) {
		this.eId = eId;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public float geteSalary() {
		return eSalary;
	}

	public void seteSalary(float eSalary) {
		this.eSalary = eSalary;
	}

	public Employee() {
	
	}

}

public class StreamDemo10 {

	public static void main(String[] args) {

		List<Employee> empList = new ArrayList<Employee>(Arrays.asList(new Employee(1, "A", 12345.55f),
				new Employee(2, "B", 100.55f), new Employee(3, "C", 2345.55f), new Employee(4, "D", 34545.55f),
				new Employee(5, "E", 45456.55f)));
		
		
		Map<Integer, Employee> employeeMap = empList.stream().collect(Collectors.toMap(Employee::geteId, Function.identity()));
		

		for(Map.Entry m:employeeMap.entrySet()){
			
			Employee emp = (Employee) m.getValue();
			System.out.println(m.getKey()+"-"+emp.geteName());
			
			
		}
	}
}
