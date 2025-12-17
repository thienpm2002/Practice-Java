package sliding_window;

public class MinimumRemovalsTargetSum {

	static int minRemovalsRec(int[] arr, int k, int left, int right, int cnt) {
		if (k == 0) {
			return cnt;
		}

		if (left > right)
			return Integer.MAX_VALUE;

		int l = minRemovalsRec(arr, k - arr[left], left + 1, right, cnt + 1);

		int r = minRemovalsRec(arr, k - arr[right], left, right - 1, cnt + 1);

		return Math.min(l, r);

	}

	static int solution1(int[] arr, int k) {
		int res = minRemovalsRec(arr, k, 0, arr.length - 1, 0);

		return res == Integer.MAX_VALUE ? -1 : res;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 4, 1, 3, 2 };
		int k = 5;

		System.out.println(solution1(arr, k));
	}
}
