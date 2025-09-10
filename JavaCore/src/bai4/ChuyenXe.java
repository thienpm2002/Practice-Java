package bai4;

import java.util.Scanner;

public class ChuyenXe {
	protected String maSoChuyen;
	protected String tenTaiXe;
	protected String soXe;
	protected double doanhThu;

	public String getMaSoChuyen() {
		return maSoChuyen;
	}

	public void setMaSoChuyen(String maSoChuyen) {
		this.maSoChuyen = maSoChuyen;
	}

	public String getTenTaiXe() {
		return tenTaiXe;
	}

	public void setTenTaiXe(String tenTaiXe) {
		this.tenTaiXe = tenTaiXe;
	}

	public String getSoXe() {
		return soXe;
	}

	public void setSoXe(String soXe) {
		this.soXe = soXe;
	}

	public double getDoanhThu() {
		return doanhThu;
	}

	public void setDoanhThu(double doanhThu) {
		this.doanhThu = doanhThu;
	}

	public ChuyenXe() {
		this.maSoChuyen = "";
		this.tenTaiXe = "";
		this.soXe = "";
		this.doanhThu = 0.0;
	}

	public ChuyenXe(String maSoChuyen, String tenTaiXe, String soXe, double doanhThu) {
		super();
		this.maSoChuyen = maSoChuyen;
		this.tenTaiXe = tenTaiXe;
		this.soXe = soXe;
		this.doanhThu = doanhThu;
	}

	public void inTTin() {
		System.out.println("------------------Thong tin chuyen xe ------------");
		System.out.println("Ma so chuyen: " + maSoChuyen);
		System.out.println("Ten tai xe: " + tenTaiXe);
		System.out.println("So xe: " + soXe);
		System.out.println("Doanh thu: " + doanhThu);
	}

	public void nhapTTin() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap ma so chuyen:");
		this.maSoChuyen = sc.nextLine();
		System.out.println("Nhap ten tai xe:");
		this.tenTaiXe = sc.nextLine();
		System.out.println("Nhap so xe:");
		this.soXe = sc.nextLine();
		System.out.println("Nhap doanh thu:");
		this.doanhThu = sc.nextDouble();
		sc.close();
	}

}
