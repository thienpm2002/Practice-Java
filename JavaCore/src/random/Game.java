package random;

import java.util.Scanner;

public class Game {
	private int number;

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public Game() {
		this.number = (int) (Math.random() * 100) + 1;
	}

	public void play(Scanner s) {
		int number;
		do {
			System.out.println("Nhap du doan: ");
			number = s.nextInt();
			s.nextLine();
			if (number == 101)
				break;
			if (number == 102) {
				System.out.println("Ket qua cua cho choi la: " + this.number);
				break;
			}
			if (this.number == number) {
				System.out.println("Chuc mung nguoi choi chien thang");
				break;
			} else {
				System.out.println("Chuc ban may man lan sau");
				System.out.println("Nhap so 101 de thoat");
				System.out.println("Nhap so 102 de xem ket qua");
			}
		} while (number != 101);
	}
}
