package bai3;

public class Main {
	public static void main(String[] args) {
		NhanVien nv1 = new NhanVien("Thien", 1.2, 500000.0, 20000000.0);
		NhanVien nv2 = new NhanVien("A", 1.5, 600000.0, 40000000.0);

		PhongBan pb = new PhongBan("IT", (byte) 0, (byte) 10);
		pb.themNV(nv2);
		pb.themNV(nv1);
		pb.inTTin();

	}
}
