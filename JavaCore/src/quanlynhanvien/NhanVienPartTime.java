package quanlynhanvien;

import java.util.Scanner;

public class NhanVienPartTime extends Nhanvien {
	private int soGio;
	private double luongMotGio;

	public NhanVienPartTime(int soGio, double luongMotgio, String ten, int tuoi, double luongCoban) {
		super(ten, tuoi, luongCoban);
		this.soGio = soGio;
		this.luongMotGio = luongMotgio;
	}

	public NhanVienPartTime() {
		super();
		this.soGio = 0;
		this.luongMotGio = 0;
	}

	public int getSoGio() {
		return soGio;
	}

	public void setSoGio(int soGio) {
		this.soGio = soGio;
	}

	public double getLuongMotGio() {
		return luongMotGio;
	}

	public void setLuongMotGio(double luongMotGio) {
		this.luongMotGio = luongMotGio;
	}

	public double tinhLuong() {
		return soGio * luongMotGio;
	}

	public void inTTin() {
		super.inTTin();
		System.out.println("Luong: " + this.tinhLuong());
	}

	public void nhapTTin(Scanner s) {
		super.nhapTTin(s);

		System.out.println("Nhap so gio lam: ");
		this.soGio = s.nextInt();
		s.nextLine();

		System.out.println("Nhap luong mot gio lam: ");
		this.luongMotGio = s.nextDouble();
		s.nextLine();

	}
}
