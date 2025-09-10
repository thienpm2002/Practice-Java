package sanpham;

public abstract class SanPham {
	protected String hang;
	protected String ten;
	protected double gia;

	public String getHang() {
		return hang;
	}

	public void setHang(String hang) {
		this.hang = hang;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public SanPham(String hang, String ten, double gia) {
		super();
		this.hang = hang;
		this.ten = ten;
		this.gia = gia;
	}

	public SanPham() {
		super();
		this.hang = "";
		this.ten = "";
		this.gia = 0;
	}

	public abstract double tinhthue();
}
