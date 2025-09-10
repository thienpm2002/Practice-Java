package EasyProblems;

public class PrimalityTest {
	// Kiem tra so nguyen to
	public static boolean solution(int n) {
		if (n <= 1)
			return false;
		int mid = n / 2;
		for (int i = 2; i <= mid; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

	public static void main(String[] args) {
		int n = 178987;
		if (solution(n)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
