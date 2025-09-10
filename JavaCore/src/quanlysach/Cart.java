package quanlysach;

import java.util.ArrayList;
import java.util.Scanner;

public class Cart {
	private ArrayList<Sach> ds;
	private double sum;

	public Cart() {
		this.ds = new ArrayList<>();
		this.sum = 0;
	}

	public double getSum() {
		return sum;
	}

	public void setSum(double sum) {
		this.sum = sum;
	}

	public ArrayList<Sach> getDs() {
		return ds;
	}

	public void setDs(ArrayList<Sach> ds) {
		this.ds = ds;
	}

	public void inTTin() {
		System.out.println("-------------------Cart-----------------");
		if (ds.isEmpty()) {
			System.out.println("Chua co sach nao duoc them vao gio hang");
			return;
		}
		for (int i = 0; i < ds.size(); i++) {
			ds.get(i).inTTin();
			this.setSum(this.getSum() + ds.get(i).getGia() * ds.get(i).getSoLuong());
		}
		System.out.println("Tong tien: " + sum);
	}

	public void insertToCart(ThuVien tv, Scanner s) {
		Sach book = tv.timKiemTen(s);
		if (book == null) {
			System.out.println("Khong co sach nay");
			return;
		}
		System.out.println("Nhap so luong muon mua:");
		int sl = s.nextInt();
		s.nextLine();
		if (sl > book.getSoLuong()) {
			System.out.println("Vuot qua so luong cho phep");
			return;
		}
		if (book.getSoLuong() == 0) {
			System.out.println("Sach da ban het");
			return;
		}
		ds.add(new Sach(book.getTen(), book.getTacGia(), book.getGia(), sl, book.getTheLoai()));
		book.setSoLuong(book.getSoLuong() - sl);
		System.out.println("Them vao gio hang thanh cong");
	}

	public void removeCart(ThuVien tv, Scanner s) {
		Sach book = tv.timKiemTen(s);
		if (book == null) {
			System.out.println("Khong co sach nay");
			return;
		}
		if (ds.isEmpty()) {
			System.out.println("Khong tim thay cuon sach");
		}
		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).getTen().equals(book.getTen())) {
				book.setSoLuong(book.getSoLuong() + ds.get(i).getSoLuong());
				ds.remove(i);
				System.out.println("Da  xoa thanh cong");
				return;
			}
		}
		System.out.println("Khong tim thay cuon sach");
	}

	public void updateCart(ThuVien tv, Scanner s) {
		Sach book = tv.timKiemTen(s);
		if (book == null) {
			System.out.println("Khong co sach nay");
			return;
		}
		if (ds.isEmpty()) {
			System.out.println("Khong tim thay cuon sach trong gio hang");
		}

		System.out.println("Nhap so luong muon thay doi:");
		int sl = s.nextInt();
		s.nextLine();

		for (int i = 0; i < ds.size(); i++) {
			if (ds.get(i).getTen().equals(book.getTen())) {
				if (sl > (book.getSoLuong() + ds.get(i).getSoLuong())) {
					System.out.println("Vuot qua so luong cho phep");
					return;
				}
				book.setSoLuong(book.getSoLuong() + ds.get(i).getSoLuong() - sl);
				ds.get(i).setSoLuong(sl);
				System.out.println("Da cap nhat thanh cong");
				return;
			}
		}
		System.out.println("Khong tim thay cuon sach");
	}

	public void thanhToan() {
		System.out.println("-----------------Hoa don -----------------");
		this.inTTin();
		System.out.println("Da thanh toan thanh cong");
		this.getDs().clear();
	}
}
