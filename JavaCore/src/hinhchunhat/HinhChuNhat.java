package hinhchunhat;

public class HinhChuNhat {
	private double chieuDai;
	private double chieuRong;

	public double getChieuDai() {
		return chieuDai;
	}

	public void setChieuDai(double chieuDai) {
		this.chieuDai = chieuDai;
	}

	public double getChieuRong() {
		return chieuRong;
	}

	public void setChieuRong(double chieuRong) {
		this.chieuRong = chieuRong;
	}

	public HinhChuNhat(double chieuDai, double chieuRong) {
		this.chieuDai = chieuDai;
		this.chieuRong = chieuRong;
	}

	public void tinhChuVi() {
		System.out.println("Chu vi: " + (chieuDai + chieuRong));
	}

	public void tinhDienTich() {
		System.out.println("Dien tich: " + chieuDai * chieuRong);
	}
}
