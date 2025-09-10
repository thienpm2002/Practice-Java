package bai1;

import java.util.Objects;

public class NhanVien {
	private String tenNhanVien;
	private double luongcoBan;
	private double hesoLuong;
	private double Luong_Max;

	public NhanVien(String ten, double luong, double heSo, double Luong_Max) {
		this.hesoLuong = heSo;
		this.Luong_Max = Luong_Max;
		this.luongcoBan = luong;
		this.tenNhanVien = ten;
	}

	@Override
	public int hashCode() {
		return Objects.hash(Luong_Max, hesoLuong, luongcoBan, tenNhanVien);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		NhanVien other = (NhanVien) obj;
		return Double.doubleToLongBits(Luong_Max) == Double.doubleToLongBits(other.Luong_Max)
				&& Double.doubleToLongBits(hesoLuong) == Double.doubleToLongBits(other.hesoLuong)
				&& Double.doubleToLongBits(luongcoBan) == Double.doubleToLongBits(other.luongcoBan)
				&& Objects.equals(tenNhanVien, other.tenNhanVien);
	}

	public String getTen() {
		return this.tenNhanVien;
	}

	public void setTen(String name) {
		this.tenNhanVien = name;
	}

	public double getLuong() {
		return this.luongcoBan;
	}

	public void setLuong(double luong) {
		this.luongcoBan = luong;
	}

	public double getHeSo() {
		return this.hesoLuong;
	}

	public void setHeSo(double heSo) {
		this.hesoLuong = heSo;
	}

	public double getLuongMax() {
		return this.Luong_Max;
	}

	public void setLuongMax(double luongMax) {
		this.Luong_Max = luongMax;
	}

	public boolean tangLuong(double x) {
		double newHeSoLuong = this.hesoLuong + x;
		if (this.Luong_Max < newHeSoLuong * this.luongcoBan) {
			System.out.println("Khong cho phep thay doi");
			return false;
		}
		this.setHeSo(newHeSoLuong);
		System.out.println("Thay doi he so luong thanh cong");
		return true;
	}

	public double tinhLuong() {
		return this.luongcoBan * this.hesoLuong;
	}

	public void inTTin() {
		System.out.println("Ten nhan vien: " + this.getTen());
		System.out.println("Luong co ban: " + this.getLuong());
		System.out.println("He so luong: " + this.getHeSo());
		System.out.println("Luong lon nhat: " + this.getLuongMax());
	}
}
