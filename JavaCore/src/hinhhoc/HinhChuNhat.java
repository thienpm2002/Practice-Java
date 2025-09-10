package hinhhoc;

public class HinhChuNhat implements HinhHoc {
	private double rong;
	private double dai;

	public double getRong() {
		return rong;
	}

	public void setRong(double rong) {
		this.rong = rong;
	}

	public double getDai() {
		return dai;
	}

	public void setDai(double dai) {
		this.dai = dai;
	}

	public HinhChuNhat(double rong, double dai) {
		super();
		this.rong = rong;
		this.dai = dai;
	}

	public double tinhChuVi() {
		return (rong + dai) * 2;
	}

	public double tinhDienTich() {
		return (rong * dai);
	}
}
