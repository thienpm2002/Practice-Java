package movieTicket;

public class ShowTime {
	private Movie movie;
	private String startTime;
	private Seat[] seats = { new Seat(1, false), new Seat(2, false), new Seat(3, false), new Seat(4, false),
			new Seat(5, false), new Seat(6, false) };

	public ShowTime() {
		super();
	}

	public ShowTime(Movie movie, String startTime) {
		super();
		this.movie = movie;
		this.startTime = startTime;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public String getStartTime() {
		return startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public Seat[] getSeats() {
		return seats;
	}

	public void setSeats(Seat[] seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "ShowTime [movie= " + movie.getTitle() + ", startTime= " + startTime + "]";
	}

}
