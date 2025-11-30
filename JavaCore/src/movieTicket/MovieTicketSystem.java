package movieTicket;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MovieTicketSystem {
	private List<Theater> theaters = new ArrayList<>();

	public List<Theater> getTheaters() {
		return theaters;
	}

	public void addTheater(Theater theater) {
		theaters.add(theater);
	}

	public void printTheaters() {
		for (int i = 0; i < theaters.size(); i++) {
			System.out.println((i + 1) + ". " + theaters.get(i).getName());
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		MovieTicketSystem system = new MovieTicketSystem();

		Movie movie1 = new Movie("Inception", "Sci-Fi", 3600);
		Movie movie2 = new Movie("The Dark Knight", "Action", 7200);
		Movie movie3 = new Movie("Chain Shaw Man", "Anime", 7200);
		Movie movie4 = new Movie("Vinland Saga", "Anime", 7200);
		Movie movie5 = new Movie("Attack On Titan", "Anime", 7200);

		Auditorium auditorium1 = new Auditorium(1, Arrays.asList(new ShowTime(movie1, "09:00 26/11/2025"),
				new ShowTime(movie5, "13:00 26/11/2025"), new ShowTime(movie2, "15:00 26/11/2025")));
		Auditorium auditorium2 = new Auditorium(2, Arrays.asList(new ShowTime(movie3, "11:00 26/11/2025"),
				new ShowTime(movie4, "15:00 26/11/2025"), new ShowTime(movie1, "17:00 26/11/2025")));

		Theater theater1 = new Theater("Hai Ba Trung", "Center Builder", Arrays.asList(auditorium1));
		Theater theater2 = new Theater("Thanh Xuan", "ThanhXuan Movie", Arrays.asList(auditorium2));
		system.addTheater(theater1);
		system.addTheater(theater2);

		System.out.println("------------------------ MovieTicketSystem ------------------------");
		int choice;
		do {
			system.printTheaters();
			System.out.println("3. Booking");
			System.out.println("4. List tickets");
			System.out.println("5. Cancel ticket");
			System.out.println("0. Exit");
			System.out.println("Enetr choice: ");
			choice = sc.nextInt();
			sc.nextLine();
			switch (choice) {
			case 1: {
				System.out.println("-------------- ShowTimes --------------------");
				List<Auditorium> auditoriums = system.getTheaters().get(0).getAuditoriums();
				for (Auditorium a : auditoriums) {
					a.printShowTime();
				}
				break;
			}
			case 2: {
				System.out.println("-------------- ShowTimes --------------------");
				List<Auditorium> auditoriums = system.getTheaters().get(1).getAuditoriums();
				for (Auditorium a : auditoriums) {
					a.printShowTime();
				}
				break;
			}
			case 0: {
				System.out.println("Exit successfully");
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + choice);
			}

		} while (choice != 0);
		sc.close();
	}
}
