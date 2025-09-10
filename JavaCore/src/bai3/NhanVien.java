package bai3;

public class NhanVien {
	private String tenNV;
	private double heSL;
	private double luongCB = 750000;
	private double luongMax = 20000000;

	public NhanVien(String ten, double heSL, double luongCB, double luongMax) {
		this.tenNV = ten;
		this.heSL = heSL;
		this.luongCB = luongCB;
		this.luongMax = luongMax;
	}

	public String getTenNV() {
		return tenNV;
	}

	public void setTenNV(String tenNV) {
		this.tenNV = tenNV;
	}

	public double getHeSL() {
		return heSL;
	}

	public void setHeSL(double heSL) {
		this.heSL = heSL;
	}

	public double getLuongCB() {
		return luongCB;
	}

	public void setLuongCB(double luongCB) {
		this.luongCB = luongCB;
	}

	public double getLuongMax() {
		return luongMax;
	}

	public void setLuongMax(double luongMax) {
		this.luongMax = luongMax;
	}

	public void inTTin() {
		System.out.println("Ten nhan vien: " + tenNV);
		System.out.println("He so luong: " + heSL);
		System.out.println("Luong co ban: " + luongCB);
		System.out.println("Luong max: " + luongMax);
	}

	public double tinhLuong() {
		return heSL * luongCB;
	}

	public boolean tangLuong(double x) {
		double newHeSL = heSL + x;
		if (newHeSL * luongCB > luongMax) {
			System.out.println("Tang luong that bai!");
			return false;
		}
		System.out.println("Tang luong thanh cong");
		this.setHeSL(newHeSL);
		return true;
	}

}
