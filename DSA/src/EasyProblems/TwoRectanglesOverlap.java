package EasyProblems;

public class TwoRectanglesOverlap {
//   HCN duoc biet dien boi 2 diem l: diem phia tren ben trai, r: Diem phia duoi ben phai. 
	static class Point {
		int x, y;

		Point(int x, int y) {
			this.x = x;
			this.y = y;
		}

	}

	// Kiem tra 2 HCN co giao nhau hay khong
	// Rang buoc theo truc tung: y(r2) <= y(l1) && y(r1) <= y(l2) && Rang buoc theo
	// truc hoanh: x(l2) <= x(r1) && x(l1) <= x(r2)
	static boolean solution(Point l1, Point r1, Point l2, Point r2) {
		if (r2.y <= l1.y && r1.y <= l2.y && l2.x <= r1.x && l1.x <= r2.x)
			return true;
		return false;
	}

	public static void main(String[] args) {
		Point l1 = new Point(0, 10);
		Point r1 = new Point(10, 0);
		Point l2 = new Point(-10, 5);
		Point r2 = new Point(-1, 0);
		if (solution(l1, r1, l2, r2))
			System.out.println("Rectangles Overlap");
		else
			System.out.println("Rectangles Don't Overlap");
	}
}
