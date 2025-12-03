package TwoPoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

	static int solution2(int[] a, int[] b, int k) {
		int n = a.length;
		int m = b.length;

		List<Integer> arr = new ArrayList<>();

		int i = 0, j = 0;
		while (i < n || j < m) {
			if (i == n) {
				arr.add(b[j]);
				j++;
				continue;
			}
			if (j == m) {
				arr.add(a[i]);
				i++;
				continue;
			}

			if (a[i] < b[j]) {
				arr.add(a[i]);
				i++;
			} else if (a[i] > b[j]) {
				arr.add(b[j]);
				j++;
			} else {
				arr.add(a[i]);
				arr.add(b[j]);
				i++;
				j++;
			}
		}

		return arr.get(k - 1);

	}

	public static void main(String[] args) {
		int[] a = { 1, 4, 8, 10, 12 };
		int[] b = { 5, 7, 11, 15, 17 };
		int k = 6;
		System.out.println(solution2(a, b, k));
	}
}
