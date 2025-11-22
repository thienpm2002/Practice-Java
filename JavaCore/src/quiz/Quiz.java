package quiz;

public interface Quiz {
	public void start();

	public void checkAnswer(int questionIndex, int choice);

	public void showScore();
}
