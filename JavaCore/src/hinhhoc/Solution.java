package hinhhoc;

public class Solution {
	public static void main(String[] args) {
		HinhVuong hv = new HinhVuong(3.4);
		HinhChuNhat hcn = new HinhChuNhat(4, 5.7);

		System.out.println("Chu vi hinh vuong: " + hv.tinhChuVi());
		System.out.println("Dien tich hinh vuong: " + hv.tinhDienTich());
		System.out.println("Chu vi hinh chu nhat: " + hcn.tinhChuVi());
		System.out.println("Dien tich hinh chu nhat: " + hcn.tinhDienTich());

	}
}
