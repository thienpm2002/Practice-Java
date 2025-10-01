package Array;

import java.util.HashMap;

public class LongestCommonSpanTwoBinaryArrays {
	/*
	 * static int solution1(int[] arr1, int[] arr2) { int res = 0; int n =
	 * arr1.length; for (int i = 0; i < n; i++) { int sum1 = 0; int sum2 = 0; for
	 * (int j = i; j < n; j++) { sum1 += arr1[j]; sum2 += arr2[j]; if (sum1 == sum2)
	 * { res = Math.max(res, j - i + 1); } } } return res; }
	 */
	static int solution2(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int maxLen = 0;
		int prefixSum1 = 0, prefixSum2 = 0;
		HashMap<Integer, Integer> diffMap = new HashMap<>();
		for (int i = 0; i < n; i++) {
			prefixSum1 += arr1[i];
			prefixSum2 += arr2[i];

			int currentDiff = prefixSum1 - prefixSum2;
			if (currentDiff == 0) {
				maxLen = Math.max(maxLen, i + 1);
			}

			if (diffMap.containsKey(currentDiff)) {
				maxLen = Math.max(maxLen, i - diffMap.get(currentDiff));
			} else {
				diffMap.put(currentDiff, i);
			}
		}
		return maxLen;
	}

	public static void main(String[] args) {
		int[] arr1 = { 1, 1, 1 };
		int[] arr2 = { 0, 0, 0 };
		System.out.println(solution2(arr1, arr2));
	}
}
