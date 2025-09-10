package dangnhap;

import java.util.ArrayList;
import java.util.Scanner;

public class DangNhap {
	private ArrayList<User> users = new ArrayList<>();

	public void login(Scanner s) {
		System.out.println("---------------- Dang nhap ----------");
		System.out.println("Nhap email: ");
		String email = s.nextLine();
		System.out.println("Nhap mat khau: ");
		String password = s.nextLine();
		if (users.isEmpty())
			System.out.println("Tai khoan khong ton tai");
		else {
			for (int i = 0; i < users.size(); i++) {
				if (users.get(i).getEmail().equals(email) && users.get(i).getPassword().equals(password))
					System.out.println("Dang nhap thanh cong");
				else {
					continue;
				}
			}
			System.out.println("Tai khoan hoac mat khau khong dung");
		}
	}

	public void register(Scanner s) {
		System.out.println("---------------- Dang ky ----------");
		System.out.println("Nhap tai email: ");
		String email = s.nextLine();
		System.out.println("Nhap tai mat khau: ");
		String password = s.nextLine();
		System.out.println("Nhap ten: ");
		String name = s.nextLine();
		User user = new User(email, password, name);
		if (users.isEmpty()) {
			users.add(user);
			System.out.println("Dang ky thanh cong");
		} else {
			if (users.contains(user))
				System.out.println("Nguoi dung da ton tai!");
			else {
				users.add(user);
				System.out.println("Dang ky thanh cong");
			}
		}
	}
}
