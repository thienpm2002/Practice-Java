package EasyProblems;

public class FibonacciNumber {
	static int solution(int n) {
		if (0 <= n && n < 2)
			return n;
		return solution(n - 1) + solution(n - 2);
	}

	public static void main(String[] args) {
		System.out.println(solution(2));
	}
}
