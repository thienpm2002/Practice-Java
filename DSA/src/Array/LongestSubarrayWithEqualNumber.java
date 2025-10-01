package Array;

import java.util.HashMap;

public class LongestSubarrayWithEqualNumber {
	/*
	 * static int solution1(int[] arr) { int n = arr.length; int res =
	 * Integer.MIN_VALUE; for (int i = 0; i < n; i++) { int zero = 0, one = 0; for
	 * (int j = i; j < n; j++) { if (arr[j] == 0) { zero++; } else { one++; } if
	 * (zero == one) { res = Math.max(2 * zero, res);
	 * 
	 * } } } return res == Integer.MIN_VALUE ? 0 : res; }
	 */
	static int solution2(int[] arr) {
		int n = arr.length;
		HashMap<Integer, Integer> mp = new HashMap<>();
		int preSum = 0;
		int res = 0;
		for (int i = 0; i < n; i++) {
			preSum += (arr[i] == 0) ? -1 : 1;

			if (preSum == 0) {
				res += 1;
			}
			if (mp.containsKey(preSum)) {
				res = Math.max(res, i - mp.get(preSum));
			} else {
				mp.put(preSum, i);
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 1, 1, 0, 0 };
		System.out.println(solution2(arr));
	}
}
