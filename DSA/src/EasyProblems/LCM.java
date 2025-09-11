package EasyProblems;

public class LCM {
	// Tim boi chung nho nhat, BCNN = (a*b) / UCLN
	static int solution(int a, int b) {
		return (a * b) / GCD.solution(a, b);
	}

	public static void main(String[] args) {
		System.out.println(solution(10, 5));
	}
}
