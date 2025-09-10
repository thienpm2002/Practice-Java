package quanlynhanvien;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhSachNhanVien {
	private ArrayList<Nhanvien> ds = new ArrayList<>();

	public ArrayList<Nhanvien> getDs() {
		return ds;
	}

	public void setDs(ArrayList<Nhanvien> ds) {
		this.ds = ds;
	}

	public void themNhanVien(Scanner s) {
		System.out.println("1.Them part time");
		System.out.println("2.Them full time");
		System.out.println("Lua chon: ");
		int luaChon = s.nextInt();
		s.nextLine();
		if (luaChon == 1) {
			NhanVienPartTime nv = new NhanVienPartTime();
			nv.nhapTTin(s);
			ds.add(nv);
		} else {
			NhanVienFullTime nv = new NhanVienFullTime();
			nv.nhapTTin(s);
			ds.add(nv);
		}
	}

	public void inDanhSach() {
		if (ds.isEmpty()) {
			System.out.println("Danh sach rong");
		} else {
			for (int i = 0; i < ds.size(); i++) {
				ds.get(i).inTTin();
			}
		}
	}

	public void tongLuong() {
		if (ds.isEmpty()) {
			System.out.println("Danh sach rong");
		} else {
			double sum = 0;
			for (int i = 0; i < ds.size(); i++) {
				if (ds.get(i) instanceof NhanVienPartTime || ds.get(i) instanceof NhanVienFullTime) {
					sum += ds.get(i).tinhLuong();
				}
			}
			System.out.println("Tong luong nhan vien: " + sum);
		}
	}
}
