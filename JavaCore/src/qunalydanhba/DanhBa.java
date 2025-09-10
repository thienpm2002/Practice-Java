package qunalydanhba;

import java.util.ArrayList;
import java.util.Scanner;

public class DanhBa {
	private ArrayList<ThongTin> db = new ArrayList<>();

	public void inTTin() {
		if (db.isEmpty())
			System.out.println("Danh ba trong");
		else {
			System.out.println("----------------------Danh ba --------------------------");
			for (int i = 0; i < db.size(); i++) {
				db.get(i).inTTin();
			}
		}
	}

	public void themLienHe(Scanner s) {
		System.out.println("Nhap ten lien he: ");
		String ten = s.nextLine();
		System.out.println("Nhap so dien thoai lien he: ");
		String sdt = s.nextLine();
		for (int i = 0; i < db.size(); i++) {
			if (db.get(i).getSdt().equals(sdt)) {
				System.out.println("Lien he da ton tai!");
				return;
			}
		}
		ThongTin tt = new ThongTin(ten, sdt);
		db.add(tt);
		System.out.println("Them lien he moi thanh cong");
	}

	public void tinKiem(String ten) {
		if (db.isEmpty())
			System.out.println("Danh ba trong");
		else {
			for (int i = 0; i < db.size(); i++) {
				if (db.get(i).getTen().equals(ten)) {
					db.get(i).inTTin();
				}
			}
		}
	}

	public void xoaLienHe(String sdt) {
		if (db.isEmpty())
			System.out.println("Danh ba trong");
		else {
			for (int i = 0; i < db.size(); i++) {
				if (db.get(i).getSdt().equals(sdt)) {
					db.remove(i);
					System.out.println("Xoa lien he thanh cong");
					break;
				}
			}
		}
	}
}
