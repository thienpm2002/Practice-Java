package TwoPoints;

import java.util.HashMap;
import java.util.Map;

public class PairSumSortedAndRotatedArray {
	static boolean solution1(int[] arr, int target) {
		Map<Integer, Integer> hm = new HashMap<>();
		for (int i = 0; i < arr.length; i++) {
			hm.put(arr[i], i);
		}

		for (int i = 0; i < arr.length; i++) {
			int k = target - arr[i];
			if (hm.containsKey(k))
				return true;
		}
		return false;
	}

	static boolean solution2(int[] arr, int target) {
		// Tim vi tri quay
		int n = arr.length;
		int k = 0;
		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {
				k = i;
				break;
			}
		}

		int l = k + 1, r = k;
		while (l != r) {
			if (r < 0)
				r = n - 1;
			if (l == n)
				l = 0;
			if (arr[l] + arr[r] == target)
				return true;
			else if (arr[l] + arr[r] > target) {
				r--;
			} else {
				l++;
			}

		}

		return false;

	}

	public static void main(String[] args) {
		int[] arr = { 11, 11, 15, 26, 38, 9, 10 };
		int target = 35;
		System.out.println(solution2(arr, target));
	}
}
