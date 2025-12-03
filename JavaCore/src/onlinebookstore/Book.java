package onlinebookstore;

import java.time.LocalDate;

public class Book {
	private String title;
	private String author;
	private double price;
	private LocalDate publishDate;

	public Book(String author, String title, double price, LocalDate publishDate) {
		super();
		this.title = title;
		this.author = author;
		this.price = price;
		this.publishDate = publishDate;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public LocalDate getPublishDate() {
		return publishDate;
	}

	public void setPublishDate(LocalDate publishDate) {
		this.publishDate = publishDate;
	}

	@Override
	public String toString() {
		return "Book [title=" + title + ", author=" + author + ", price=" + price + ", publishDate=" + publishDate
				+ "]";
	}

}
