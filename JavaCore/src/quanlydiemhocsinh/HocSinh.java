package quanlydiemhocsinh;

public class HocSinh {
	private String ten;
	private double diem;
	private String loai;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getDiem() {
		return diem;
	}

	public void setDiem(double diem) {
		this.diem = diem;
	}

	public String getLoai() {
		return loai;
	}

	public void setLoai(String loai) {
		this.loai = loai;
	}

	public HocSinh(String ten, double diem) {
		this.ten = ten;
		this.diem = diem;
		if (0.0 <= diem && diem < 5.0) {
			this.loai = "Trung binh, yeu";
		} else if (5.0 <= diem && diem < 8.0) {
			this.loai = "Kha";
		} else {
			this.loai = "Gioi";
		}
	}

}
