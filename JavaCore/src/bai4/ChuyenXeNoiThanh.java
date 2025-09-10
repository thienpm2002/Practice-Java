package bai4;

import java.util.Scanner;

public class ChuyenXeNoiThanh extends ChuyenXe {
	protected int soTuyen;
	protected long soKM;

	public int getSoTuyen() {
		return soTuyen;
	}

	public void setSoTuyen(int soTuyen) {
		this.soTuyen = soTuyen;
	}

	public long getSoKM() {
		return soKM;
	}

	public void setSoKM(long soKM) {
		this.soKM = soKM;
	}

	public ChuyenXeNoiThanh(int soTuyen, long soKM) {
		super();
		this.soTuyen = soTuyen;
		this.soKM = soKM;
	}

	public ChuyenXeNoiThanh() {
		super();
		this.soTuyen = 0;
		this.soKM = 0;
	}

	public ChuyenXeNoiThanh(String maSoChuyen, String tenTaiXe, String soXe, double doanhThu, int soTuyen, long soKm) {
		super(maSoChuyen, tenTaiXe, soXe, doanhThu);
		this.soTuyen = soTuyen;
		this.soKM = soKm;
	}

	public void inTTin() {
		super.inTTin();
		System.out.println("So tuyen: " + soTuyen);
		System.out.println("So km di duoc: " + soKM);
	}

	public void nhapTTin() {
		Scanner s = new Scanner(System.in);
		super.nhapTTin();
		System.out.println("Nhap so tuyen:");
		this.soTuyen = s.nextInt();
		System.out.println("Nhap so km di duoc:");
		this.soKM = s.nextLong();
		s.close();
	}

}
