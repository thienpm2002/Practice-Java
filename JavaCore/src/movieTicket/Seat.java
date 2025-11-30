package movieTicket;

public class Seat {
	private int seatNumber;
	private boolean isBooked;

	public Seat() {
		super();
	}

	public Seat(int seatNumber, boolean isBooked) {
		super();
		this.seatNumber = seatNumber;
		this.isBooked = isBooked;
	}

	public int getSeatNumber() {
		return seatNumber;
	}

	public void setSeatNumber(int seatNumber) {
		this.seatNumber = seatNumber;
	}

	public boolean isBooked() {
		return isBooked;
	}

	public void setBooked(boolean isBooked) {
		this.isBooked = isBooked;
	}

}
