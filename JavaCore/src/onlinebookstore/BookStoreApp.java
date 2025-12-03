package onlinebookstore;

import java.util.Scanner;

public class BookStoreApp {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		BookStore store = new BookStore();
		int choice;
		do {
			System.out
					.println("-------------------------------------- Store Book APP ---------------------------------");
			System.out.println("1. View Book");
			System.out.println("2. Group by publish date");
			System.out.println("3. Filter by price");
			System.out.println("4. Search by title");
			System.out.println("0. Exit");
			System.out.println("Enter: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				store.viewBooks();
				break;
			}
			case 2: {
				store.groupByDate();
				break;
			}
			case 3: {
				System.out.println("Enter max price:");
				double maxPrice = sc.nextDouble();
				store.filterByPrice(maxPrice);
				break;
			}
			case 4: {
				System.out.println("Enter title:");
				String title = sc.nextLine().trim();
				if (title.length() == 0) {
					System.out.println("Title invalid");
					break;
				}
				Book book = store.searchByTitle(title).orElse(null);
				if (book == null) {
					System.out.println("Book with " + title + " not found");
				} else {
					System.out.println(book);
				}
				break;
			}
			case 0: {
				System.out.println("Exit successfully!");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

		} while (choice != 0);

		sc.close();
	}
}
