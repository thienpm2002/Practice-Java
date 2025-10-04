package SearchingAlgorithms;

import java.util.Arrays;

public class LargestElement {

	// Use Linear Search
	static int solution1(int[] arr) {
		int max = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++) {
			max = (max < arr[i]) ? arr[i] : max;
		}
		return max;
	}

	// Use Recursive
	static int findMax(int[] arr, int i) {
		if (i == arr.length - 1) {
			return arr[i];
		}
		int recMax = findMax(arr, i + 1);

		return Math.max(arr[i], recMax);
	}

	static int solution2(int[] arr) {
		return findMax(arr, 0);

	}

	// Use Library Methods
	static int solution3(int[] arr) {
		Arrays.sort(arr);
		return arr[arr.length - 1];
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 4, 50 };
		System.out.println(solution3(arr));
	}
}
