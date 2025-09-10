package bai3;

public class PhongBan {
	private String tenPB;
	private byte soNV;
	private byte soNvMax = 100;
	private NhanVien[] nvs;

	public PhongBan(String tenPB, byte soNV, byte soNvMax) {
		this.tenPB = tenPB;
		this.soNV = soNV;
		this.soNvMax = soNvMax;
		this.nvs = new NhanVien[soNvMax];
	}

	public String getTenPB() {
		return tenPB;
	}

	public void setTenPB(String tenPB) {
		this.tenPB = tenPB;
	}

	public byte getSoNV() {
		return soNV;
	}

	public void setSoNV(byte soNV) {
		this.soNV = soNV;
	}

	public byte getSoNvMax() {
		return soNvMax;
	}

	public void setSoNvMax(byte soNvMax) {
		this.soNvMax = soNvMax;
	}

	public boolean themNV(NhanVien nv) {
		if (soNV >= soNvMax) {
			return false;
		}
		nvs[soNV] = nv;
		soNV++;
		return true;
	}

	public NhanVien xoaNV() {
		if (soNV > 0) {
			NhanVien tmp = nvs[soNV - 1];
			nvs[soNV - 1] = null;
			soNV--;
			return tmp;
		} else {
			return null;
		}
	}

	public double tongLuong() {
		if (soNV <= 0) {
			return 0;
		}
		double sum = 0;
		for (int i = 0; i < soNV; i++) {
			sum += nvs[i].tinhLuong();
		}
		return sum;
	}

	public void inTTin() {

		System.out.println("Ten: " + tenPB);
		System.out.println("So nhan vien: " + soNV);
		System.out.println("So nhan vien max: " + soNvMax);
		if (soNV <= 0) {
			System.out.println("Phong ban chua co nhan vien nao");
		} else {
			System.out.println("------------Thong tin cac nhan vien ------------");
			for (int i = 0; i < soNV; i++) {
				nvs[i].inTTin();
			}
		}
	}
}
