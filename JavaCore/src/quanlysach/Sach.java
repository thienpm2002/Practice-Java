package quanlysach;

public class Sach {
	private String ten;
	private String tacGia;
	private double gia;
	private TheLoai theLoai;
	private int soLuong;

	public TheLoai getTheLoai() {
		return theLoai;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public String getTacGia() {
		return tacGia;
	}

	public void setTacGia(String tacGia) {
		this.tacGia = tacGia;
	}

	public double getGia() {
		return gia;
	}

	public void setGia(double gia) {
		this.gia = gia;
	}

	public Sach(String ten, String tacGia, double gia, int soLuong, TheLoai tl) {
		this.ten = ten;
		this.tacGia = tacGia;
		this.gia = gia;
		this.soLuong = soLuong;
		this.theLoai = tl;
	}

	public void inTTin() {
		System.out.println("-----------------------");
		System.out.println("Ten: " + ten);
		System.out.println("Tac gia: " + tacGia);
		System.out.println("Gia: " + gia);
		System.out.println("So luong: " + soLuong);
		System.out.println("The loai: " + theLoai);
		System.out.println("-----------------------");
	}

	public void giamGia(double phanTram) {
		gia = gia - gia * (double) (phanTram / 100);
		System.out.println("Gia sau khi giam: " + gia);
	}
}
