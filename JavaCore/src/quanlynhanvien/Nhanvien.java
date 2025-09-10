package quanlynhanvien;

import java.util.Scanner;

public class Nhanvien {
	protected String ten;
	protected int tuoi;
	protected double luongCoban;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getTuoi() {
		return tuoi;
	}

	public void setTuoi(int tuoi) {
		this.tuoi = tuoi;
	}

	public double getLuongCoban() {
		return luongCoban;
	}

	public void setLuongCoban(double luongCoban) {
		this.luongCoban = luongCoban;
	}

	public Nhanvien(String ten, int tuoi, double luongCoban) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.luongCoban = luongCoban;
	}

	public Nhanvien() {
		this.ten = "";
		this.tuoi = 0;
		this.luongCoban = 0;
	}

	public double tinhLuong() {
		return 0;
	}

	public void inTTin() {
		System.out.println("Ten: " + ten);
		System.out.println("Tuoi: " + tuoi);
	}

	public void nhapTTin(Scanner s) {
		System.out.println("------------- Nhap thong tin--------------");
		System.out.println("Nhap ten: ");
		this.ten = s.nextLine();

		System.out.println("Nhap tuoi: ");
		this.tuoi = s.nextInt();
		s.nextLine();

		System.out.println("Nhap luong co ban: ");
		this.luongCoban = s.nextDouble();
	}
}
