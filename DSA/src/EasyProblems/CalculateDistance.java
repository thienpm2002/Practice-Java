package EasyProblems;

public class CalculateDistance {
	// Tinh khoang cach 2 diem
	public static double solution(int x1, int y1, int x2, int y2) {
		return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
	}

	public static void main(String[] args) {
		int x1 = 3, x2 = 7, y1 = 4, y2 = 7;
		System.out.println(solution(x1, y1, x2, y2));
	}
}
