package core5;

public class Request {
	private String date;
	private String status;
	private String user;
	private String action;

	public Request(String date, String status, String user, String action) {
		super();
		this.date = date;
		this.user = user;
		this.action = action;
		this.status = status;
	}

	public String getDate() {
		return date;
	}

	public String getUser() {
		return user;
	}

	public String getAction() {
		return action;
	}

	public String getStatus() {
		return status;
	}

	@Override
	public String toString() {
		return "Request [date=" + date + ", status=" + status + ", user=" + user + ", action=" + action + "]";
	}

}
