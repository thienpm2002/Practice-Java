package TwoPoints;

import java.util.Arrays;

public class KElementOfTwoArrays {

	static int solution1(int[] a, int[] b, int k) {
		int n = a.length;
		int m = b.length;

		int[] arr = new int[m + n];

		for (int i = 0; i < n; i++) {
			arr[i] = a[i];
		}

		for (int i = 0; i < m; i++) {
			arr[n + i] = b[i];
		}

		Arrays.sort(arr);

		return arr[k - 1];

	}

	public static void main(String[] args) {
		int[] a = { 2, 3, 6, 7, 9 };
		int[] b = { 1, 4, 8, 10 };
		int k = 5;
		System.out.println(solution1(a, b, k));
	}
}
