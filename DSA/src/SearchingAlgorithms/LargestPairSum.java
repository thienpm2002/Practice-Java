package SearchingAlgorithms;

import java.util.Arrays;

public class LargestPairSum {
	static int solution1(int[] arr) {
		int n = arr.length;
		if (n < 2)
			return -1;
		int sumMax = Integer.MIN_VALUE;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (sumMax < arr[i] + arr[j])
					sumMax = arr[i] + arr[j];
			}
		}

		return sumMax;
	}

	static int solution2(int[] arr) {

		int n = arr.length;
		if (n < 2)
			return -1;
		Arrays.sort(arr);

		return arr[n - 1] + arr[n - 2];

	}

	static int solution3(int[] arr) {

		int n = arr.length;
		if (n < 2)
			return -1;
		int max = Integer.MIN_VALUE;
		int sencond = Integer.MIN_VALUE;

		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				sencond = max;
				max = arr[i];
			} else if (arr[i] > sencond) {
				sencond = arr[i];
			}
		}

		return max + sencond;

	}

	public static void main(String[] args) {
		int[] arr = { 12, 34, 10, 6, 40 };
		System.out.println(solution3(arr));
	}
}
