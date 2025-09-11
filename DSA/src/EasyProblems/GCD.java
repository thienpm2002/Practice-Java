package EasyProblems;

public class GCD {
	// Tim UCLN , UCLN(a,b) = UCLN(b,a%b)
	static int solution(int a, int b) {
		while (b != 0) {
			int t = b;
			b = a % b;
			a = t;
		}
		return a;
	}

	public static void main(String[] args) {
		System.out.println(solution(20, 28));
	}
}
