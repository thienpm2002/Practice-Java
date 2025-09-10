package moviess;

public class Movie extends Media {
	private String director;
	private String genre;

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Movie(int mediaId, String tile, double duration, String director, String genre) {
		super(mediaId, tile, duration);
		// TODO Auto-generated constructor stub
		this.director = director;
		this.genre = genre;
	}

	public void display() {
		System.out.println("Movie Information:");
		System.out.println(this.getInfor() + ", Director:" + director + ", Genre:" + genre);
	}

}
