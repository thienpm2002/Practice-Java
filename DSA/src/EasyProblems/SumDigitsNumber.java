package EasyProblems;

public class SumDigitsNumber {
	// Tong cac chu so Vd 12345 -> 15
	public static int solution(int n) {
		int sum = 0;
		int tmp = n;
		while (tmp != 0) {
			int a = tmp % 10;
			tmp = tmp / 10;
			sum += a;
		}
		return sum;
	}

	public static void main(String[] args) {
		int n = 678;
		System.out.println(solution(n));
	}
}
