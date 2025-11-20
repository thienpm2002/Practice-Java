package EmployeeManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class ListEmployeesImpl implements ListEmployees {
	private List<Employee> ds;

	ListEmployeesImpl() {
		this.ds = new ArrayList<>();
	}

	@Override
	public void employeeTable() {
		// TODO Auto-generated method stub
		if (ds.isEmpty()) {
			System.out.println("Table is empty!");
			return;
		}
		for (Employee epl : ds) {
			System.out.println("----------------------------------------------------------------------");
			System.out.println(epl.toString());
		}
	}

	@Override
	public void insert(Employee epl) {
		// TODO Auto-generated method stub

		ds.add(epl);
		System.out.println("Insert employee is successfully!");
	}

	@Override
	public void delete(int code) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).getCode() == code) {
				ds.remove(i);
				System.out.println("Delete employee is successfully!");
				return;
			}
		}
		System.out.println("Employee not found!");
	}

	@Override
	public Employee search(int code) {
		// TODO Auto-generated method stub
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).getCode() == code)
				return ds.get(i);
		}
		return null;
	}

}
