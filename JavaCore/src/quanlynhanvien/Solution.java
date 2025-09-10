package quanlynhanvien;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		DanhSachNhanVien ds = new DanhSachNhanVien();
		ds.themNhanVien(s);
		ds.inDanhSach();
		ds.tongLuong();
		s.close();
	}
}
