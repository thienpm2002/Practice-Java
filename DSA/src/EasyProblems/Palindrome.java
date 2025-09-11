package EasyProblems;

public class Palindrome {
	static boolean solution(int n) {
		int reverNumber = 0;
		int tmp = n;
		while (tmp != 0) {
			reverNumber = reverNumber * 10 + tmp % 10;
			tmp /= 10;
		}
		return reverNumber == n;
	}

	public static void main(String[] args) {
		System.out.println(solution(12321) ? "True" : "False");
	}
}
