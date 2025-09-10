package BookstoreDiver;

import java.util.Scanner;

public class BookstoreDriver {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String name = s.nextLine();
		String id = s.nextLine();
		double amout = s.nextDouble();
		BookOrder bo = new BookOrder(name, id, amout);
		bo.printInfo();
		s.close();
	}
}
