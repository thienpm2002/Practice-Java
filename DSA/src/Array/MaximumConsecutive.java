package Array;

public class MaximumConsecutive {
	static int solution(int[] arr, int k) {
		int n = arr.length;
		int l = 0, r = 0;
		int maxLen = 0;
		// Window sliding
		while (r < n) {
			if (arr[r] == 0) {
				k--;
			}

			while (k < 0) {
				if (arr[l] == 0) {
					k++;
				}
				l++;
			}

			maxLen = Math.max(maxLen, r - l + 1);
			r++;
		}

		return maxLen;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 0, 1, 1, 0, 1, 0, 1, 1, 1 };
		int k = 2;
		System.out.println(solution(arr, k));
	}
}
