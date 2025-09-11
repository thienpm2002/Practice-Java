package EasyProblems;

public class DecimalToBinary {
	static void solution(int n) {
		if (n == 1) {
			System.out.print(n % 2);
		} else {
			solution(n / 2);
			System.out.print(n % 2);
		}

	}

	public static void main(String[] args) {
		solution(33);
	}
}
