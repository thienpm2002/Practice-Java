package bai4;

import java.util.Scanner;

public class ChuyenXeNgoaiThanh extends ChuyenXe {
	protected String noiDen;
	protected int soNgay;

	public String getNoiDen() {
		return noiDen;
	}

	public void setNoiDen(String noiDen) {
		this.noiDen = noiDen;
	}

	public int getSoNgay() {
		return soNgay;
	}

	public void setSoNgay(int soNgay) {
		this.soNgay = soNgay;
	}

	public ChuyenXeNgoaiThanh() {
		super();
		this.noiDen = "";
		this.soNgay = 0;
	}

	public ChuyenXeNgoaiThanh(String maSoChuyen, String tenTaiXe, String soXe, double doanhThu, String noiDen,
			int soNgay) {
		super(maSoChuyen, tenTaiXe, soXe, doanhThu);
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}

	public ChuyenXeNgoaiThanh(String noiDen, int soNgay) {
		super();
		this.noiDen = noiDen;
		this.soNgay = soNgay;
	}

	public void inTTin() {
		super.inTTin();
		System.out.println("Noi den: " + noiDen);
		System.out.println("So ngay di duoc: " + soNgay);
	}

	public void nhapTTin() {
		Scanner s = new Scanner(System.in);
		super.nhapTTin();
		System.out.println("Nhap noi den:");
		this.noiDen = s.nextLine();
		System.out.println("Nhap so ngay di duoc:");
		this.soNgay = s.nextInt();
		s.close();
	}

}
