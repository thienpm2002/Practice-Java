package hinhhoc;

public class HinhVuong implements HinhHoc {
	private double canh;

	public HinhVuong(double canh) {
		super();
		this.canh = canh;
	}

	public double getCanh() {
		return canh;
	}

	public void setCanh(double canh) {
		this.canh = canh;
	}

	public double tinhChuVi() {
		return canh * 4;
	}

	public double tinhDienTich() {
		return canh * canh;
	}
}
