package streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamApi {
	public static void main(String[] args) {
		List<Employee> employees = Arrays.asList(new Employee("Nguyen Van A", 28, 12000, "IT"),
				new Employee("Tran Thi B", 32, 15000, "HR"), new Employee("Le Van C", 24, 9000, "IT"),
				new Employee("Pham Thi D", 45, 20000, "Finance"), new Employee("Hoang Van E", 38, 17000, "Finance"),
				new Employee("Vu Thi F", 29, 11000, "IT"), new Employee("Do Van G", 41, 13000, "HR"),
				new Employee("Bui Thi H", 22, 8000, "Marketing"), new Employee("Pham Van K", 27, 9500, "Marketing"),
				new Employee("Nguyen Thi M", 36, 16000, "IT"), new Employee("Le Thi N", 30, 10500, "HR"),
				new Employee("Tran Van P", 50, 25000, "Finance"), new Employee("Hoang Thi Q", 26, 9800, "Marketing"));

		// Loc nhan vien co luong > 10,000
		employees.stream().filter(empl -> empl.getSalary() > 10000)
				.forEach(empl -> System.out.println(empl.toString()));

		// Lấy danh sách tên nhân viên
		List<String> names = employees.stream().map(Employee::getName).toList();
		System.out.println(names);

		// Tinh tong luong tat ca nhan vien
		double sum = employees.stream().map(Employee::getSalary).reduce(0.0, Double::sum);

		System.out.println(sum);

		// Tim nhan vien lon tuoi nhat
		Employee oldest = employees.stream().max(Comparator.comparingInt(Employee::getAge)).orElse(null);

		System.out.println(oldest.toString());

		// Group theo phong ban (department -> List<Employee>)

		Map<String, List<Employee>> groupByDept = employees.stream()
				.collect(Collectors.groupingBy(Employee::getDepartment));

		groupByDept.forEach((dept, list) -> {
			System.out.println("Department: " + dept);
			list.forEach(System.out::println);
			System.out.println();
		});

		// Tinh luong trung binh cua moi phong ban
		Map<String, Double> avgSalaryPerDept = employees.stream().collect(
				Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));

		avgSalaryPerDept.forEach((dept, avgSalary) -> System.out.println(dept + " : " + avgSalary));

	}
}
