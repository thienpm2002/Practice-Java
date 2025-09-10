package bai2;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Nhap so hoc sinh");
			int n = scanner.nextInt();
			Student[] cls = new Student[n];
			for (int i = 0; i < n; i++) {
				System.out.print("Nhap ten hoc sinh thu " + (i + 1) + ": ");
				String name = scanner.next();
				System.out.print("Nhap nam sinh: ");
				int year = scanner.nextInt();
				cls[i] = new Student(name, year); // GÁN TRỰC TIẾP VÀO MẢNG
			}
			int total = 0;
			System.out.println("Danh sach lop:");
			for (Student st : cls) {
				total = total + 2025 - st.getYear();
				System.out.println("Ten:" + st.getName());
			}
			System.out.println(total);
		}
	}
}
