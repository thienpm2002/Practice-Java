package SearchingAlgorithms;

import java.util.Arrays;

public class SecondLargestElement {
	// Use sort
	static int solution1(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] != arr[n - 1])
				return arr[i];
		}
		return -1;
	}

	static int solution2(int[] arr) {
		int n = arr.length;
		int max = -1;
		int second = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] > max) {
				second = max;
				max = arr[i];
			} else if (arr[i] < max && arr[i] > second) {
				second = arr[i];
			}
		}
		return second;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 9 };
		System.out.println(solution2(arr));
	}
}
