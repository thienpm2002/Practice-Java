package EmployeeManagementSystem;

import java.util.Scanner;

public class EmployeeManagementSystem {
	private static ListEmployees ds = new ListEmployeesImpl();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int condition;
		do {
			System.out.println("------------------ Employee-Management-System ---------------------");
			System.out.println("1. Built The Employee Table.");
			System.out.println("2. Insert New Entries.");
			System.out.println("3. Delete The Entries.");
			System.out.println("4. Search A Record.");
			System.out.println("0. Exit.");
			System.out.println("Enter choose: ");
			condition = sc.nextInt();

			switch (condition) {
			case 1: {
				ds.employeeTable();
				break;
			}
			case 2: {
				System.out.println("Enter name: ");
				String name = sc.next();
				System.out.println("Enter code: ");
				int code = sc.nextInt();
//				sc.next();
				System.out.println("Enter designation: ");
				String designation = sc.next();
				System.out.println("Enter exp: ");
				int exp = sc.nextInt();
//				sc.nextLine();
				System.out.println("Enter age: ");
				int age = sc.nextInt();

				Employee epl = new Employee(name, code, designation, exp, age);

				ds.insert(epl);

				break;
			}
			case 3: {
				System.out.println("Enter code: ");
				int code = sc.nextInt();
				ds.delete(code);
				break;
			}
			case 4: {
				System.out.println("Enter code: ");
				int code = sc.nextInt();
				Employee epl = ds.search(code);
				if (epl != null) {
					System.out.println(epl.toString());
				} else {
					System.out.println("Employee not found");
				}
				break;
			}
			case 0: {
				System.out.println("Exit Employee-Management-System");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + condition);
			}

		} while (condition != 0);
		sc.close();
	}

}
