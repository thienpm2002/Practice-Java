package Array;

import java.util.Arrays;

public class ThreePairSum {
	static boolean solution(int[] arr, int target) {
		int n = arr.length;
		Arrays.sort(arr);
		int right = n - 1;
		for (int i = 0; i < n - 2; i++) {
			int left = i;
			int mid = i + 1;
			while (mid < right) {
				if (arr[left] + arr[mid] + arr[right] == target)
					return true;
				else if (arr[left] + arr[mid] + arr[right] > target)
					right--;
				else
					mid++;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 40, 20, 10, 3, 6, 7 };
		int target = 13;
		if (solution(arr, target)) {
			System.out.println("true");
		} else {
			System.out.println("false");
		}
	}
}
