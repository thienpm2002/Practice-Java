package sliding_window;

public class MaximumSumOfASubarrayOfSizeK {
	static int solution1(int[] arr, int k) {
		int n = arr.length;
		int maxSum = Integer.MIN_VALUE;
		for (int i = 0; i < n - 1; i++) {
			int sum = 0;
			for (int j = i; j < i + k; j++) {
				sum += arr[j];
			}
			maxSum = Math.max(maxSum, sum);
		}

		return maxSum;
	}

	static int solution2(int[] arr, int k) {
		int n = arr.length;

		if (n <= k) {
			return -1;
		}

		int maxSum = 0;
		for (int i = 0; i < k; i++) {
			maxSum += arr[i];
		}
		int windowSum = maxSum;
		for (int i = k; i < n; i++) {
			windowSum += arr[i] - arr[i - k];
			maxSum = Math.max(maxSum, windowSum);
		}

		return maxSum;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 2, 10, 23, 3, 1, 0, 20 };
		int k = 4;

		System.out.println(solution2(arr, k));
	}
}
