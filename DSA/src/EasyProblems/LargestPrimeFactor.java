package EasyProblems;

public class LargestPrimeFactor {
	static long solution(long n) {
		long largest = -1;

		while (n % 2 == 0) {
			largest = 2;
			n = n / 2;
		}

		for (int i = 3; i * i <= n; i += 2) {
			while (n % i == 0) {
				largest = i;
				n = n / i;
			}
		}
		if (n > 2) {
			return n;
		}
		return largest;
	}

	public static void main(String[] args) {
		System.out.println(solution(60)); // 5
		System.out.println(solution(13195)); // 29
		System.out.println(solution(97)); // 97
		System.out.println(solution(1000000000039L)); // test số lớn
	}
}
