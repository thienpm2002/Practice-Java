package qunalydanhba;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DanhBa db = new DanhBa();
		int luachon;
		do {
			System.out.println("------------------------------ Menu ------------------------");
			System.out.println("1. In danh ba");
			System.out.println("2. Them thong tin lien he");
			System.out.println("3. Tim kiem lien he theo ten");
			System.out.println("4. Xoa lien he");
			System.out.println("0. Thoat");
			System.out.println("Nhap lua chon: ");
			luachon = s.nextInt();
			s.nextLine();

			switch (luachon) {
			case 1: {
				db.inTTin();
				break;
			}
			case 2: {
				db.themLienHe(s);
				break;
			}
			case 3: {
				System.out.println("Nhap ten muon tim: ");
				String ten = s.nextLine();
				db.tinKiem(ten);
				break;
			}
			case 4: {
				System.out.println("Nhap so dien thoai muon xoa: ");
				String sdt = s.nextLine();
				db.xoaLienHe(sdt);
				break;
			}
			case 0: {
				System.out.println("Thoat chuong trinh thanh cong");
				break;
			}
			default:
				System.out.println("Lua chon khong hop le!");
			}

		} while (luachon != 0);

		s.close();
	}
}
