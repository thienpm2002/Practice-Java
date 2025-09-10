package quanlynhanvien;

import java.util.Scanner;

public class NhanVienFullTime extends Nhanvien {
	private int soNgay;

	public NhanVienFullTime(int soNgay, String ten, int tuoi, double luongCoban) {
		super(ten, tuoi, luongCoban);
		this.soNgay = soNgay;
	}

	public NhanVienFullTime() {
		super();
		this.soNgay = 0;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	public double tinhLuong() {
		return soNgay * luongCoban;
	}

	public void inTTin() {
		super.inTTin();
		System.out.println("Luong: " + this.tinhLuong());
	}

	public void nhapTTin(Scanner s) {
		super.nhapTTin(s);

		System.out.println("Nhap so ngay lam: ");
		this.soNgay = s.nextInt();
		s.nextLine();
	}
}
