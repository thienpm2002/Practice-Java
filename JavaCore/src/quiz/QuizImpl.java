package quiz;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class QuizImpl implements Quiz {
	private List<Question> questions;
	private int score = 0;

	public QuizImpl() {
		this.questions = Arrays.asList(new Question("1 + 1 = ?", new String[] { "1", "2", "3", "4" }, "2", 1),
				new Question(
						"Thu do cua Viet Nam la?", new String[] { "HCM", "Ha Noi", "Hue", "Da Nang" }, "Ha Noi", 1),
				new Question("Mau cua la cay la?", new String[] { "Do", "Vang", "Xanh", "Tim" }, "Xanh", 1),
				new Question("Java duoc phat trien boi?",
						new String[] { "Microsoft", "Google", "Sun Microsystems", "Apple" }, "Sun Microsystems", 1),
				new Question("2 x 5 = ?", new String[] { "15", "5", "10", "8" }, "10", 1));
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("---------------- Quiz Game ------------------");
		Scanner sc = new Scanner(System.in);
		int index = 0;
		int choice;
		while (index < questions.size()) {
			System.out.println();
			System.out.println("Q" + (index + 1) + ". " + questions.get(index).getTitle());
			System.out.println("1. " + questions.get(index).getAnswers()[0]);
			System.out.println("2. " + questions.get(index).getAnswers()[1]);
			System.out.println("3. " + questions.get(index).getAnswers()[2]);
			System.out.println("4. " + questions.get(index).getAnswers()[3]);
			System.out.println("Enter choice (1-4): ");
			choice = sc.nextInt();
			if (choice > 4 || choice <= 0) {
				System.out.println("Enter choice again (1-4): ");
				choice = sc.nextInt();
			}
			checkAnswer(index, choice);
			index++;

		}

		sc.close();

	}

	@Override
	public void checkAnswer(int questionIndex, int choice) {
		// TODO Auto-generated method stub
		String userAnswer = questions.get(questionIndex).getAnswers()[choice - 1];
		String answer = questions.get(questionIndex).getResult();

		if (answer.equals(userAnswer)) {
			score += questions.get(questionIndex).getScore();
		}

	}

	public void showScore() {
		System.out.println();
		System.out.println("Quiz game complete!");
		System.out.println("Your Score: " + score + "/5");
	}
}
