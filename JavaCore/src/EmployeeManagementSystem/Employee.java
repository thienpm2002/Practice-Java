package EmployeeManagementSystem;

public class Employee {
	private String name;
	private int code;
	private String designation;
	private int exp;
	private int age;

	public Employee(String name, int code, String designation, int exp, int age) {
		super();
		this.name = name;
		this.code = code;
		this.designation = designation;
		this.exp = exp;
		this.age = age;
	}

	public Employee() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", code=" + code + ", designation=" + designation + ", exp=" + exp + ", age="
				+ age + "]";
	}

}
