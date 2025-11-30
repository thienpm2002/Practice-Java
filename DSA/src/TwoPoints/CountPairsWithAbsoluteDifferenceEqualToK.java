package TwoPoints;

import java.util.Arrays;

public class CountPairsWithAbsoluteDifferenceEqualToK {

	static int solution1(int[] arr, int k) {
		int n = arr.length;
		int res = 0;
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (Math.abs(arr[i] - arr[j]) == k)
					res++;
			}
		}
		return res;
	}

	static int solution2(int[] arr, int k) {
		int n = arr.length;
		int res = 0;
		Arrays.sort(arr);
		int i = 0, j = 0;
		while (j < n) {
			if (arr[j] - arr[i] < k) {
				j++;
			} else if (arr[j] - arr[i] > k) {
				i++;
			} else {
				int ele1 = arr[i], ele2 = arr[j];
				int cnt1 = 0, cnt2 = 0;

				while (j < n && arr[j] == ele2) {
					j++;
					cnt2++;
				}

				while (i < n && arr[i] == ele1) {
					i++;
					cnt1++;
				}

				if (ele1 == ele2) {
					res += (cnt2 * (cnt1 - 1)) / 2;
				} else {
					res += (cnt2 * cnt1);
				}

			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 4, 1, 4, 5 };
		int k = 3;
		System.out.println(solution2(arr, k));
	}
}
