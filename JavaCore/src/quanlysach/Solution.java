package quanlysach;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ThuVien tv = new ThuVien();
		Cart gioHang = new Cart();
		int lc;
		do {
			System.out.println("------------------------------Thu Vien ---------------------------");
			System.out.println("1.Danh sach cac cuon sach");
			System.out.println("2.Them sach");
			System.out.println("3.Tim kiem sach theo ten");
			System.out.println("4.Tim kiem sach theo ten tac gia");
			System.out.println("5.Mua sach");
			System.out.println("6.Thong tin gio hang");
			System.out.println("7.Xoa sach khoi gio hang");
			System.out.println("8.Updat gio hang");
			System.out.println("9.Thanh toan gio hang");
			System.out.println("0.Thoat");
			System.out.println("Lua chon: ");
			lc = s.nextInt();
			s.nextLine();

			switch (lc) {
			case 1: {
				tv.inTTin();
				break;
			}
			case 2: {
				tv.themSach(s);
				break;
			}
			case 3: {
				Sach book = tv.timKiemTen(s);
				if (book == null) {
					System.out.println("Khong tim thay sach");
					return;
				}
				book.inTTin();
				break;
			}
			case 4: {
				tv.timKiemTacGia(s);
				break;
			}
			case 5: {
				gioHang.insertToCart(tv, s);
				break;
			}
			case 6: {
				gioHang.inTTin();
				break;
			}
			case 7: {
				gioHang.removeCart(tv, s);
				break;
			}
			case 8: {
				gioHang.updateCart(tv, s);
				break;
			}
			case 9: {
				gioHang.thanhToan();
				break;
			}
			case 0: {
				System.out.println("Thoat thanh cong");
				break;
			}
			default:
				System.out.println("Khong hop le");
			}
		} while (lc != 0);

		s.close();
	}
}
