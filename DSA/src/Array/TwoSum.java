package Array;

import java.util.Arrays;

public class TwoSum {
	static boolean solution(int[] arr, int target) {
		Arrays.sort(arr);
		int n = arr.length;
		int start = 0;
		int end = n - 1;
		while (start < end) {
			if (arr[start] + arr[end] == target)
				return true;
			if (arr[start] + arr[end] > target)
				end--;
			else
				start++;
		}

		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 0, -1, 2, -3, 1 };
		int target = -2;
		if (solution(arr, target)) {
			System.out.println("True");
		} else {
			System.out.println("False");
		}
	}
}
