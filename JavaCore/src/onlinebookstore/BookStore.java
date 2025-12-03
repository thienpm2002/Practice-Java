package onlinebookstore;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class BookStore {
	private List<Book> books;

	public BookStore() {
		books = List.of(new Book("Java Programming", "Geek1", 39.99, LocalDate.of(2021, 1, 15)),
				new Book("Learning Java 8", "Geek2", 49.99, LocalDate.of(2020, 5, 10)),
				new Book("Advanced Java", "Geek3", 59.99, LocalDate.of(2021, 8, 20)),
				new Book("Spring Framework", "Geek4", 29.99, LocalDate.of(2019, 11, 30)));

	}

	// Xem danh sach Book
	public void viewBooks() {
		books.forEach(System.out::println);
	}

	// Nhom sach theo nam xuat ban
	public void groupByDate() {
		books.stream().collect(Collectors.groupingBy(Book::getPublishDate)).forEach((date, list) -> {
			System.out.println("publishDate: " + date);
			list.forEach(System.out::println);
			System.out.println();
		});
	}

	// Loc dua tren price
	public void filterByPrice(double maxPrice) {
		books.stream().filter(b -> b.getPrice() <= maxPrice).forEach(System.out::println);
	}

	// Tim kiem theo title
	public Optional<Book> searchByTitle(String title) {
		return books.stream().filter(b -> title.equals(b.getTitle())).findFirst();
	}

}
