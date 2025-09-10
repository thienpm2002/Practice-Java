package moviess;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int id = s.nextInt();
		s.nextLine();
		String title = s.nextLine();
		double duration = s.nextDouble();
		s.nextLine();
		String director = s.nextLine();
		String genre = s.nextLine();
		Movie m = new Movie(id, title, duration, director, genre);
		m.display();
		s.close();
	}
}
