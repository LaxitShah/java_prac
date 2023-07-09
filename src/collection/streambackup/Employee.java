package collection.streambackup;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Employee {

	private int id;
	private String name;
	private int age;
	private String gender;

	public Employee(int id, String name, int age, String gender) {

		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
	}

	public static Predicate<Employee> isAligible() {

		// true false
		return p -> p.age >= 18;
	}

	public static Predicate<Employee> isMale() {

		return p -> p.gender.equalsIgnoreCase("male") && p.name.startsWith("a");
	}

	public static List<Employee> filteringEmployees(List<Employee> employees, Predicate<Employee> predicate) {

		return employees.stream().filter(predicate).collect(Collectors.toList());

	}

	public static void main(String[] args) {

		String name;

		Employee e1 = new Employee(1, "deven", 18, "Male");
		Employee e2 = new Employee(2, "poojan", 17, "Male");
		Employee e3 = new Employee(3, "raj", 21, "Male");
		Employee e4 = new Employee(4, "ajy", 13, "Male");
		Employee e5 = new Employee(5, "anjana", 13, "feMale");
		Employee e6 = new Employee(6, "daya", 13, "feMale");

		List<Employee> employees = new ArrayList<Employee>();

		employees.add(e1);
		employees.add(e2);
		employees.add(e3);
		employees.add(e4);
		employees.add(e5);
		employees.add(e6);

		List<Employee> newlist = filteringEmployees(employees, isMale());
		for (Employee e : newlist) {

			System.out.println(e.name);
		}

	}

}
