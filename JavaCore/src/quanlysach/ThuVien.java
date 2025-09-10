package quanlysach;

import java.util.ArrayList;
import java.util.Scanner;

public class ThuVien {
	private ArrayList<Sach> tv = new ArrayList<>();

	public void inTTin() {
		System.out.println("-----------Danh sach ------------");
		if (tv.isEmpty()) {
			System.out.println("Danh sach rong");
			return;
		}

		for (int i = 0; i < tv.size(); i++) {
			tv.get(i).inTTin();
		}
	}

	public void themSach(Scanner s) {
		System.out.println("Nhap ten sach: ");
		String ten = s.nextLine();
		System.out.println("Nhap ten tac gia: ");
		String tacGia = s.nextLine();
		System.out.println("Nhap gia sach: ");
		double gia = s.nextDouble();
		s.nextLine();
		System.out.println("Nhap so luong gia sach: ");
		int sl = s.nextInt();
		s.nextLine();
		System.out.println("------ The loai --------");
		int i = 1;
		for (TheLoai tl : TheLoai.values()) {
			System.out.println(i + "." + tl);
			i++;
		}
		System.out.println("Nhap lua chon: ");
		int lc = s.nextInt();
		s.nextLine();
		TheLoai tl = TheLoai.values()[lc - 1];
		Sach ns = new Sach(ten, tacGia, gia, sl, tl);
		tv.add(ns);
		System.out.println("Them sach thanh cong");
	}

	public Sach timKiemTen(Scanner s) {
		System.out.println("Nhap ten sach: ");
		String ten = s.nextLine();
		if (tv.isEmpty()) {
			return null;
		}
		for (int i = 0; i < tv.size(); i++) {
			if (tv.get(i).getTen().equals(ten)) {
				return tv.get(i);
			}
		}
		return null;
	}

	public void timKiemTacGia(Scanner s) {
		System.out.println("Nhap ten tac gia: ");
		String tacGia = s.nextLine();
		if (tv.isEmpty())
			System.out.println("Khong tim thay cuon sach");
		else {
			System.out.println("-----------Ket qua tim kiem----------------");
			for (int i = 0; i < tv.size(); i++) {
				if (tv.get(i).getTacGia().equals(tacGia)) {
					tv.get(i).inTTin();
				}
			}
			System.out.println("Khong tim thay cuon sach");
		}
	}

}
