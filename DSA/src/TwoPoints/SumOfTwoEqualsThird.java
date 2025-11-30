package TwoPoints;

import java.util.Arrays;

public class SumOfTwoEqualsThird {
	static boolean solution1(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = i + 2; k < n; k++) {
					if (arr[i] + arr[j] == arr[k])
						return true;
				}
			}
		}
		return false;
	}

	static boolean solution2(int[] arr) {
		int n = arr.length;
		Arrays.sort(arr);
		for (int i = 0; i < n - 2; i++) {
			int l = i + 1, r = n - 1;
			while (l < n - 1) {
				int tmp = arr[r] - arr[l];
				if (arr[i] == tmp)
					return true;
				if (tmp > arr[i]) {
					r--;
				} else {
					l++;
				}

			}
		}

		return false;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };

		System.out.println(solution2(arr));
	}
}
