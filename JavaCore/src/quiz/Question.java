package quiz;

public class Question {
	private String title;
	private String[] answers;
	private String result;
	private int score;

	public Question(String title, String[] answers, String result, int score) {
		super();
		this.title = title;
		this.answers = answers;
		this.result = result;
		this.score = score;
	}

	public Question() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String[] getAnswers() {
		return answers;
	}

	public void setAnswers(String[] answers) {
		this.answers = answers;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

}
