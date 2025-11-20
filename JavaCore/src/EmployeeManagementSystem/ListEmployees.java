package EmployeeManagementSystem;

public interface ListEmployees {

	// Hien thi danh sach
	public void employeeTable();

	// Them 1 ban ghi
	public void insert(Employee epl);

	// Xoa 1 ban ghi
	public void delete(int code);

	// Tim kiem 1 ban ghi
	public Employee search(int code);
}
