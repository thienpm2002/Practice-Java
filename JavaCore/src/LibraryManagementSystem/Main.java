package LibraryManagementSystem;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String title = s.nextLine();
		String author = s.nextLine();
		String date = s.nextLine();
		String ISBN = s.nextLine();
		Book bk = new Book(title, author, date, ISBN);
		bk.displayDetails();
		s.close();
	}
}
