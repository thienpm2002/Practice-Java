package movieTicket;

import java.util.List;

public class Auditorium {
	private int id;
	private List<ShowTime> showTimes;

	public Auditorium(int id, List<ShowTime> showTimes) {
		super();
		this.id = id;
		this.showTimes = showTimes;
	}

	public Auditorium() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<ShowTime> getShowTimes() {
		return showTimes;
	}

	public void setShowTimes(List<ShowTime> showTimes) {
		this.showTimes = showTimes;
	}

	public void printShowTime() {
		for (ShowTime s : showTimes) {
			System.out.println(s.toString());
		}
	}

}
