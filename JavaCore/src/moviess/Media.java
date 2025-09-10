package moviess;

public class Media {
	private int mediaId;
	private String title;
	private double duration;

	public int getMediaId() {
		return mediaId;
	}

	public void setMediaId(int mediaId) {
		this.mediaId = mediaId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String tile) {
		this.title = tile;
	}

	public double getDuration() {
		return duration;
	}

	public void setDuration(double duration) {
		this.duration = duration;
	}

	public Media(int mediaId, String tile, double duration) {
		super();
		this.mediaId = mediaId;
		this.title = tile;
		this.duration = duration;
	}

	public String getInfor() {
		return ("Media Id: " + mediaId + ", Title:" + title + ", Duration(minutes):" + duration);
	}

	public void display() {
		System.out.println(this.getInfor());
	}
}
