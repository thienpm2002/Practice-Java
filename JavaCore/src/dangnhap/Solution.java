package dangnhap;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DangNhap users = new DangNhap();
		int luachon;
		do {
			System.out.println("------------------- Menu ------------------");
			System.out.println("1.Dang Nhap");
			System.out.println("2.Dang ky");
			System.out.println("0.Thoat");
			System.out.println("Lua chon: ");
			luachon = s.nextInt();
			s.nextLine();
			switch (luachon) {
			case 1: {
				users.login(s);
				break;
			}
			case 2: {
				users.register(s);
				break;
			}
			case 0: {
				System.out.println("Thoat thanh cong");
				break;
			}
			default:
				System.out.println("Lua chon khong hop le");
			}
		} while (luachon != 0);

		s.close();
	}
}
