package Employee;

public class Main {
	public static void main(String[] args) {
		Employee e1 = new Employee(101, "Alice", 50000);
		e1.printInfo();
		Mananger m1 = new Mananger(102, "Bob", 75000, "IT");
		m1.printInfo();
	}
}
