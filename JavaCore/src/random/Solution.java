package random;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int luachon;
		do {
			System.out.println("---------------- Menu ----------------");
			System.out.println("1.Bat dau game");
			System.out.println("0.Thoat game");
			System.out.println("Lua chon: ");
			luachon = s.nextInt();
			s.nextLine();
			switch (luachon) {
			case 1: {
				Game game = new Game();
				game.play(s);
				break;
			}
			case 0: {
				System.out.println("Thoat thanh cong");
				break;
			}
			default:
				System.out.println("Lua chon khong phu hop");
			}
		} while (luachon != 0);
		s.close();
	}
}
