package TwoPoints;

public class SubarraysWithMaxInRange {
	static int solution(int[] arr, int l, int r) {
		int n = arr.length;
		int count = 0;
		int lastInvalid = -1, lastValid = -1;

		for (int i = 0; i < n; i++) {
			if (arr[i] > r) {
				lastInvalid = i;
				lastValid = -1;
			}

			if (arr[i] >= l && arr[i] <= r) {
				lastValid = i;
			}

			if (lastValid != -1) {
				count += lastValid - lastInvalid;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		int[] arr = { 3, 1, 6, 4 };
		int l = 3, r = 6;
		System.out.println(solution(arr, l, r));
	}
}
