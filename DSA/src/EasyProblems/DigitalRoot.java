package EasyProblems;

public class DigitalRoot {
	static int solution(int n) {
		if (n == 0)
			return 0;
		if (n % 9 == 0)
			return 9;
		return (n % 9);
	}

	public static void main(String[] args) {
		System.out.println(solution(5674));
	}
}
