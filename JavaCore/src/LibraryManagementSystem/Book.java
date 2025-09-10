package LibraryManagementSystem;

public class Book extends LibraryItem {

	public Book(String title, String author, String date, String iSBN) {
		super(title, author, date, iSBN);
		// TODO Auto-generated constructor stub
	}

	public void displayDetails() {
		System.out.println("Book tile: " + super.getTitle());
		System.out.println("Authors:: " + super.getAuthor());
		System.out.println("Publication Date:: " + super.getDate());
		System.out.println("ISBN: " + super.getISBN());
	}
}
