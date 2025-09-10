package bai2;

public class Student {
	// Thuoc tinh
	private String name;
	private int year;

	// Contructor
	Student(String name, int year) {
		this.name = name;
		this.year = year;
	}

	// Get & set
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

}
