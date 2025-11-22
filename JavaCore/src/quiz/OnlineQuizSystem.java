package quiz;

public class OnlineQuizSystem {
	public static void main(String[] args) {
		Quiz quizGame = new QuizImpl();
		quizGame.start();
		quizGame.showScore();
	}
}
