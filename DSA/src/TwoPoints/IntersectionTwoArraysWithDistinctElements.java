package TwoPoints;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionTwoArraysWithDistinctElements {

	static List<Integer> solution1(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;

		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if (arr1[i] == arr2[j]) {
					res.add(arr1[i]);
				}
			}
		}

		return res;
	}

	static List<Integer> solution2(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;

		Arrays.sort(arr1);

		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < m; i++) {
			int l = 0, r = n - 1;
			while (l <= r) {
				int mid = l + (r - l) / 2;
				if (arr1[mid] == arr2[i]) {
					res.add(arr2[i]);
					break;
				} else if (arr1[mid] > arr2[i]) {
					r = mid - 1;
				} else {
					l = mid + 1;
				}
			}
		}

		return res;
	}

	static List<Integer> solution3(int[] arr1, int[] arr2) {
		int n = arr1.length;
		int m = arr2.length;

		Set<Integer> hs = new HashSet<>();

		List<Integer> res = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			hs.add(arr1[i]);
		}

		for (int i = 0; i < m; i++) {
			if (hs.contains(arr2[i])) {
				res.add(arr2[i]);
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr1 = { 5, 6, 2, 1, 4 };
		int[] arr2 = { 7, 9, 4, 2 };
		List<Integer> res = solution3(arr1, arr2);
		for (int x : res) {
			System.out.print(x + " ");
		}
	}
}
