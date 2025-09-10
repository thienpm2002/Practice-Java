package quanlydiemhocsinh;

public class Solution {
	public static void main(String[] args) {
		LopHoc ds = new LopHoc();
		ds.themHS("thien", 8.0);
		ds.themHS("an", 5.0);
		ds.inDS();
		System.out.println("Diem tb cua lop: " + ds.diemTB());
	}
}
