package javacore;

import java.util.Scanner;

public class HelloWord {
	public static void main(String[] args) {
		// Khai bao
		Scanner scanner = new Scanner(System.in);

		System.out.println(">> LỰA CHỌN TÍNH NĂNG <<");
		System.out.println("++ ----------------------------------------- ++");
		System.out.println("| 1. Giải phương trình bậc nhất |");
		System.out.println("| 2. Giải phương trình bậc hai |");
		System.out.println("| 3. Tính số tiền điện |");
		System.out.println("| 4. Kết thúc |");
		System.out.println("++ ------------------ ++");

		System.out.println("Nhap lua chon:");
		int a = scanner.nextInt();
		// logic
		switch (a) {
		case 1: {
			System.out.println("Giai phuong trinh bac nhat");
			break;
		}
		case 2: {
			System.out.println("Giai phuong trinh bac hai");
			break;
		}
		case 3: {
			System.out.println("Tinh so dien");
			break;
		}
		case 4: {
			System.out.println("Ket thuc");
			break;
		}
		default:
			System.out.println("Lua chon khong phu hop");
		}
		scanner.close();

	}
}
