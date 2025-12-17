package core1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		StudentManager students = new StudentManager();
		Scanner sc = new Scanner(System.in);
		int choice;
		do {
			System.out.println("---------------------------- Main -------------------------------");
			System.out.println("1. View list students");
			System.out.println("2. Add student");
			System.out.println("3. Search student");
			System.out.println("4. Update student");
			System.out.println("5. Delete student");
			System.out.println("6. Sort student by score");
			System.out.println("7. Filter student by score");
			System.out.println("0. Exit");
			System.out.println("Enter choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				students.viewStudents();
				break;
			}
			case 2: {
				System.out.println("Enter name: ");
				String name = sc.nextLine();
				System.out.println("Enter score: ");
				double score = sc.nextDouble();

				students.addStudent(name, score);

				break;
			}
			case 3: {
				System.out.println("Enter student code: ");
				long code = sc.nextLong();
				sc.nextLine();
				try {
					if (code <= 0) {
						throw new IllegalArgumentException("Code invalid!");
					}
					Student s = students.searchStudent(code).orElseThrow(
							() -> new RuntimeException("Student with studentCode " + code + " not found!"));
					System.out.println(s.toString());
				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}

				break;
			}
			case 4: {
				try {
					System.out.println("Enter student code: ");
					long code = sc.nextLong();
					sc.nextLine();
					if (code <= 0) {
						throw new IllegalArgumentException("Code invalid!");
					}
					System.out.println("Enter name: ");
					String name = sc.nextLine();

					System.out.println("Enter score: ");
					double score = sc.nextDouble();
					if (score < 0 || score > 10) {
						throw new IllegalArgumentException("Score invalid!");
					}

					students.updateStudent(code, name, score);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}

				break;
			}
			case 5: {
				try {
					System.out.println("Enter student code: ");
					long code = sc.nextLong();
					if (code <= 0) {
						throw new IllegalArgumentException("Code invalid!");
					}

					students.deleteStudent(code);

				} catch (Exception e) {
					// TODO: handle exception
					System.out.println(e.getMessage());
				}

				break;
			}
			case 6: {
				students.sortByScore();
				break;
			}
			case 7: {
				System.out.println("Enter score: ");
				double score = sc.nextDouble();
				if (score < 0 || score > 10) {
					throw new IllegalArgumentException("Score invalid!");
				}
				students.filterByScore(score);
				break;
			}
			case 0: {
				System.out.println("Exit!");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}
		} while (choice != 0);

		sc.close();

	}
}
