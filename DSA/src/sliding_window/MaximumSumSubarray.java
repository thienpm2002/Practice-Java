package sliding_window;

public class MaximumSumSubarray {

	static int solution1(int[] arr, int sum) {
		int res = Integer.MIN_VALUE;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			int sumElemt = arr[i];
			for (int j = i; j < n; j++) {

				if (i != j) {
					sumElemt += arr[j];
				}

				if (sumElemt > res && sumElemt < sum) {
					res = sumElemt;
				}
			}
		}

		return res;

	}

	static int solution2(int[] arr, int sum) {
		int n = arr.length;
		int maxSum = 0, start = 0, currSum = arr[0];

		for (int i = 1; i < n; i++) {
			if (currSum < sum) {
				maxSum = Math.max(currSum, maxSum);
			}

			while (currSum + arr[i] > sum && start < i) {
				currSum -= arr[start++];
			}

			currSum += arr[i];

			if (currSum < sum) {
				maxSum = Math.max(currSum, maxSum);
			}
		}

		return maxSum;

	}

	public static void main(String[] args) {
		int[] arr = { 20, 2, 3, 4, 5 };
		int sum = 11;

		System.out.println(solution2(arr, sum));
	}
}
