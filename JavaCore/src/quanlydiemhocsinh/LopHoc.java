package quanlydiemhocsinh;

import java.util.ArrayList;

public class LopHoc {
	private ArrayList<HocSinh> ds = new ArrayList<>();

	public void themHS(String ten, double diem) {
		HocSinh hs = new HocSinh(ten, diem);
		ds.add(hs);
	}

	public double diemTB() {
		if (ds == null || ds.isEmpty()) {
			return 0;
		} else {
			double sum = 0;
			for (int i = 0; i < ds.size(); i++) {
				sum += ds.get(i).getDiem();
			}
			return sum / ds.size();
		}
	}

	public void inDS() {
		if (ds == null || ds.isEmpty()) {
			System.out.println("Danh sach diem rong");
		} else {
			System.out.println("---------------- Danh sach diem -------------");
			for (int i = 0; i < ds.size(); i++) {
				System.out.println(ds.get(i).getTen() + ": " + ds.get(i).getDiem() + " " + ds.get(i).getLoai());
			}
		}
	}

}
