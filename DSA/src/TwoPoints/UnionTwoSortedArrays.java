package TwoPoints;

import java.util.ArrayList;

public class UnionTwoSortedArrays {

	public static void addUnique(ArrayList<Integer> res, int x) {
		if (res.isEmpty() || res.get(res.size() - 1) != x) {
			res.add(x);
		}
	}

	static ArrayList<Integer> solution(int[] a, int[] b) {
		int n = a.length;
		int m = b.length;

		ArrayList<Integer> res = new ArrayList<>();

		int i = 0, j = 0;
		while (i < n || j < m) {
			if (i == n) {
				addUnique(res, b[j]);
				j++;
				continue;
			}
			if (j == m) {
				addUnique(res, a[i]);
				i++;
				continue;
			}

			if (a[i] < b[j]) {
				addUnique(res, a[i]);
				i++;
			} else if (a[i] > b[j]) {
				addUnique(res, b[j]);
				j++;
			} else {
				addUnique(res, a[i]);
				i++;
				j++;
			}
		}

		return res;

	}

	public static void main(String[] args) {
		int[] a = { 1, 1, 1, 1, 1 };
		int[] b = { 2, 2, 2, 2, 2 };

		ArrayList<Integer> res = solution(a, b);

		res.forEach(System.out::println);

	}
}
