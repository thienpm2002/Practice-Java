package SearchingAlgorithms;

class Rational {
	private int num;
	private int den;

	Rational(int p, int q) {
		this.num = p;
		this.den = q;
	}

	int getNum() {
		return num;
	}

	int getDen() {
		return den;
	}
}

public class RationalNumbers {
	static int solution(Rational[] arr, Rational target) {
		int n = arr.length;
		int l = 0, r = n - 1;

		while (l <= r) {
			int mid = l + (r - l) / 2;
			float elemtDiff = (float) (arr[mid].getNum() / arr[mid].getDen());
			float targetDiff = (float) (target.getNum() / target.getDen());
			if (elemtDiff == targetDiff)
				return mid;

			if (elemtDiff > targetDiff) {
				r = mid - 1;
			} else {
				l = mid + 1;
			}
		}

		return -1;
	}

	public static void main(String[] args) {
		Rational[] arr = { new Rational(1, 5), new Rational(2, 3), new Rational(3, 2), new Rational(13, 2) };
		Rational x = new Rational(3, 2);

		System.out.println(solution(arr, x));
	}
}
