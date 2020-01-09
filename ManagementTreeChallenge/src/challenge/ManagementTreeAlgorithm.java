package challenge;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ManagementTreeAlgorithm {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		addSecondTestCase(employees);
		new ManagementTreeAlgorithm().displayManagementTree(employees);
	}

	private static void addFirstTestCase(List<Employee> employees) {
		employees.add(new Employee(10, 0, "Tom"));
		employees.add(new Employee(2, 10, "Mickey"));
		employees.add(new Employee(3, 10, "Jerry"));
		employees.add(new Employee(7, 2, "John"));
		employees.add(new Employee(5, 10, "Sarah"));
	}

	private static void addSecondTestCase(List<Employee> employees) {
		employees.add(new Employee(1, 0, "Jerry"));
		employees.add(new Employee(2, 1, "Philip"));
		employees.add(new Employee(3, 2, "David"));
		employees.add(new Employee(4, 3, "Alice"));
		employees.add(new Employee(5, 4, "Jhon"));
		employees.add(new Employee(6, 3, "Mike"));
		employees.add(new Employee(7, 2, "Ken"));
		employees.add(new Employee(8, 7, "Peter"));
		employees.add(new Employee(9, 2, "Tom"));
		employees.add(new Employee(10, 1, "Stacie"));
	}

	public void displayManagementTree(List<Employee> employees) {
		String level = "";
		showEmployee(employees, 0, level);
	}

	private void showEmployee(List<Employee> employees, int i, String level) {
		List<Employee> foundEmployees = findByManagerId(employees, i);
		level = "->" + level;
		
		for (Employee employee : foundEmployees) {
			System.out.println(level + employee);
			showEmployee(employees, employee.getId(), level);
		}
	}

	private List<Employee> findByManagerId(List<Employee> employees, int managerId) {
		Stream<Employee> foundEmployees = employees.stream().filter(employee -> employee.getManagerId() == managerId);
		return foundEmployees.collect(Collectors.toList());
	}

}
