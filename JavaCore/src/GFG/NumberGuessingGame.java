package GFG;

import java.util.Scanner;

public class NumberGuessingGame {

	static boolean game(int input, int result) {
		if (input == result) {
			System.out.println("Chuc mung ban da du doan thanh cong");
			return true;
		}
		if (input < result) {
			System.out.println("Gia tri ban du doan nho hon ket qua");
		} else {
			System.out.println("Gia tri ban du doan lon hon ket qua");
		}
		return false;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int result = 1 + (int) (Math.random() * 100);
		System.out.println(result);
		int k = 3;
		int input;
		System.out.println("------------------ Number Guessing Game---------------");
		do {
			if (k == 0) {
				System.out.println(
						"Rat tiec, ban da het luot du doan!. Ket qua la " + result + ", chuc ban may man lan sau");
				break;
			}
			System.out.println("Hay nhay so ban du doan tu 1 -> 100: ");
			input = s.nextInt();
			if (game(input, result))
				break;
			k--;
		} while (true);
		s.close();
	}
}
