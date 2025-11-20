package TwoPoints;

import java.util.Arrays;

public class DutchNationalFlagProblem {

	static void solution1(int[] arr) {
		Arrays.sort(arr);
	}

	static void solution2(int[] arr) {
		int c0 = 0, c1 = 0, c2 = 0;
		int n = arr.length;

		// Dem so lan xuat hien cua 0, 1, 2;
		for (int i = 0; i < n; i++) {
			if (arr[i] == 0)
				c0++;
			else if (arr[i] == 1)
				c1++;
			else
				c2++;
		}

		int index = 0;

		// Xep phan tu 0
		for (int i = 0; i < c0; i++) {
			arr[index++] = 0;
		}

		// Xep phan tu 1
		for (int i = 0; i < c1; i++) {
			arr[index++] = 1;
		}

		// Xep phan tu 2
		for (int i = 0; i < c2; i++) {
			arr[index++] = 2;
		}

	}

	static void solution3(int[] arr) {
		int n = arr.length;

		int lo = 0, mid = 0, high = n - 1;

		while (mid <= high) {
			if (arr[mid] == 0) {
				int tmp = arr[lo];
				arr[lo++] = arr[mid];
				arr[mid++] = tmp;
			} else if (arr[mid] == 1) {
				mid++;
			} else {
				int tmp = arr[mid];
				arr[mid] = arr[high];
				arr[high--] = tmp;
			}
		}

	}

	public static void main(String[] args) {
		int[] arr = { 0, 1, 2, 0, 1, 2 };
		solution3(arr);
		for (int x : arr) {
			System.out.print(x + " ");
		}
	}
}
