package qunalydanhba;

public class ThongTin {
	private String ten;
	private String sdt;

	public ThongTin(String ten, String sdt) {
		this.ten = ten;
		this.sdt = sdt;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getSdt() {
		return sdt;
	}

	public void setSdt(String sdt) {
		this.sdt = sdt;
	}

	public void inTTin() {
		System.out.println("Ten lien lac: " + ten);
		System.out.println("So dien thoai: " + sdt);
	}
}
