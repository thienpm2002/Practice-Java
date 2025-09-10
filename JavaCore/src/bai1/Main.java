package bai1;

public class Main {
	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("Thien", 200000.0, 1.2, 1000000.0);
		NhanVien nv2 = new NhanVien("An", 500000.0, 1.5, 2000000.0);
		nv1.inTTin();
		nv2.inTTin();
	}
}
