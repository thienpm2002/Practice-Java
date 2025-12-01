package lambdaAndFunctionalInterface;

public class Main {
	public static void main(String[] args) {
		Calculator add = (a, b) -> a + b;
		Calculator minus = (a, b) -> a - b;
		Calculator multiplication = (a, b) -> a + b;
		Calculator division = (a, b) -> a / b;

		System.out.println("5 + 2 = : " + add.operate(5, 2));
		System.out.println("5 - 2 = : " + minus.operate(5, 2));
		System.out.println("5 * 2 = : " + multiplication.operate(5, 2));
		System.out.println("5 / 2 = : " + division.operate(5, 2));

	}
}
