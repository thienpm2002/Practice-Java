package sinhvien;

public class SinhVien {
	private String ten;
	private int tuoi;
	private double diemTb;

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

	public double getDiemTb() {
		return diemTb;
	}

	public void setDiemTb(double diemTb) {
		this.diemTb = diemTb;
	}

	public SinhVien(String ten, int tuoi, double diemTb) {
		this.ten = ten;
		this.tuoi = tuoi;
		this.diemTb = diemTb;
	}

	public void hienTTin() {
		System.out.println("----------- Thong tin sinh vien --------------");
		System.out.println("Ten cua sinh vien: " + ten);
		System.out.println("Tuoi cua sinh vien: " + tuoi);
		System.out.println("Diem trung binh cua sinh vien: " + diemTb);
	}
}
