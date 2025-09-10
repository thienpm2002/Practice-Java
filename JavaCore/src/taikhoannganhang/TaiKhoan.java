package taikhoannganhang;

public class TaiKhoan {
	private String soTK;
	private long soDu;
	private LoaiTaikhoan loaiTK;

	public String getSoTK() {
		return soTK;
	}

	public void setSoTK(String soTK) {
		this.soTK = soTK;
	}

	public long getSoDu() {
		return soDu;
	}

	public void setSoDu(long soDu) {
		this.soDu = soDu;
	}

	public LoaiTaikhoan getLoaiTK() {
		return loaiTK;
	}

	public TaiKhoan(String soTK, long soDu, LoaiTaikhoan loaiTK) {
		this.soTK = soTK;
		this.soDu = soDu;
		this.loaiTK = loaiTK;
	}

	public void napTien(long tien) {
		soDu += tien;
		System.out.println("Tien nap thanh cong");
	}

	public void rutTien(long tien) {
		soDu -= tien;
		System.out.println("Rut nap thanh cong");
	}

	public void hienThiSoDu() {
		System.out.println(soDu);
		System.out.println(loaiTK);
	}
}
