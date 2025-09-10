package bai4;

public class DanhSachChuyenXe {
	protected ChuyenXe[] cx;
	protected int soLuongCX;

	public DanhSachChuyenXe() {
		this.cx = new ChuyenXe[100];
		this.soLuongCX = 0;
	}

	public ChuyenXe[] getCx() {
		return cx;
	}

	public void setCx(ChuyenXe[] cx) {
		this.cx = cx;
	}

	public int getSoLuongCX() {
		return soLuongCX;
	}

	public void setSoLuongCX(int soLuongCX) {
		this.soLuongCX = soLuongCX;
	}

	public void inDanhSachCX() {
		System.out.println("-----------------Danh sach chuyen xe---------------");
		if (soLuongCX == 0) {
			System.out.println("Chua co chuyen xe nao");
		} else {
			for (int i = 0; i < soLuongCX; i++) {
				cx[i].inTTin();
			}
		}
	}

	public void themChuyenXe(int loaiXe) {
		if (soLuongCX >= 100) {
			System.out.println("Them that bai");
		} else {
			if (loaiXe == 1) {
				ChuyenXeNoiThanh nt = new ChuyenXeNoiThanh();
				nt.nhapTTin();
				cx[soLuongCX] = nt;
				soLuongCX++;
			}
			if (loaiXe == 2) {
				ChuyenXeNgoaiThanh nt = new ChuyenXeNgoaiThanh();
				nt.nhapTTin();
				cx[soLuongCX] = nt;
				soLuongCX++;
			}
		}
	}

	public void doanhThuTungLoai() {
		if (soLuongCX == 0) {
			System.out.println("Chua co chuyen xe nao");
		} else {
			double sum1 = 0;
			double sum2 = 0;
			for (int i = 0; i < soLuongCX; i++) {
				if (cx[i] instanceof ChuyenXeNoiThanh) {
					sum1 += cx[i].doanhThu;
				} else {
					sum2 += cx[i].doanhThu;
				}
			}
			System.out.println("Doanh thu chuyen xe noi thanh: " + sum1);
			System.out.println("Doanh thu chuyen xe ngoai thanh: " + sum2);
		}
	}

}
