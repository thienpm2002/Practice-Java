package bai4;

import java.util.Scanner;

public class BKTravel {
	public static void main(String[] args) {
		DanhSachChuyenXe ds = new DanhSachChuyenXe();
		Scanner s = new Scanner(System.in);
		int luachon;
		do {
			System.out.println("----------------- Quan ly thong tin cac chuyen xe ------------");
			System.out.println("----------------- 1.Xuat danh sach cac chuyen xe ------------");
			System.out.println("----------------- 2.Them chuyen xe ------------");
			System.out.println("----------------- 3.Tong daonh thu cho tung loai xe ------------");
			System.out.println("----------------- 0.Thoat ------------");
			System.out.println("Lua chon: ");
			luachon = s.nextInt();
			s.close();
			switch (luachon) {
			case 1: {
				ds.inDanhSachCX();
				break;
			}
			case 2: {
				System.out.println("Nhap loai xe: ");
				System.out.println("1. Nội thành");
				System.out.println("2. Ngoại thành");
				System.out.print("Lựa chọn: ");
				int loaiXe = s.nextInt();
				ds.themChuyenXe(loaiXe);
				break;
			}
			case 3: {
				ds.doanhThuTungLoai();
				break;
			}
			case 0: {
				System.out.println("Da thoat");
				break;
			}
			default:
				System.out.println("Lựa chọn không hợp lệ!");
				break;
			}

		} while (luachon != 0);

	}
}
