package sliding_window;

public class SmallestWindowContainingZeroOneTwo {

	static int solution1(String s) {
		int res = Integer.MAX_VALUE;

		int zeroIndex = 0, oneIndex = 0, twoIndex = 0;

		boolean zero = false, one = false, two = false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '0') {
				zeroIndex = i;
				zero = true;
			} else if (s.charAt(i) == '1') {
				oneIndex = i;
				one = true;
			} else {
				twoIndex = i;
				two = true;
			}

			if (zero && one && two) {
				res = Math.min(res, Math.max(zeroIndex, Math.max(twoIndex, oneIndex))
						- Math.min(zeroIndex, Math.min(twoIndex, oneIndex)));
			}
		}

		if (res == Integer.MAX_VALUE) {
			return -1;
		}

		return res + 1;
	}

	public static void main(String[] args) {
		String S = "01212";

		System.out.println(solution1(S));
	}
}
