package mammals;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String loai = s.nextLine();
		int age = s.nextInt();
		s.nextLine();
		String fur = s.nextLine();
		Mammal m = new Mammal(age, loai, fur);
		m.display();
		s.close();
	}
}
