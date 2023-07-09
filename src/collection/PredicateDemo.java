package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

class Employee {

	int id;
	String eName;
	int eAge;
	String gender;

	public Employee(int id, String eName, int eAge, String gender) {

		this.id = id;
		this.eName = eName;
		this.eAge = eAge;
		this.gender = gender;
	}

}

public class PredicateDemo {

	/*
	 * predicate interface is function interface and it design for lambda..
	 */

	public static Predicate<Employee> isMale() {

		return p -> p.gender.equalsIgnoreCase("male");
	}

	public static Predicate<Employee> isAligible() {

		return p -> p.eAge >= 18 && p.gender.equalsIgnoreCase("female");
	}

	public static Predicate<Employee> names() {

		return p -> p.eName.startsWith("j");
	}

	public static List<Employee> filteredEmployee(List<Employee> employees, Predicate<Employee> predicate) {

		return employees.stream().filter(predicate).collect(Collectors.toList());
	}

	public static void main(String[] args) {

		Employee e1 = new Employee(1, "jay", 20, "male");
		Employee e2 = new Employee(2, "jaya", 22, "female");
		Employee e3 = new Employee(3, "raj", 14, "male");
		Employee e4 = new Employee(4, "parth", 25, "male");
		Employee e5 = new Employee(5, "suny", 20, "male");

		List<Employee> employees = Arrays.asList(e1, e2, e3, e4, e5);

		// System.out.println(filteredEmployee(employees, isMale()));
		List<Employee> newlist = filteredEmployee(employees, names());
		for (Employee e : newlist) {

			System.out.println(e.eName);
		}

	}

}
