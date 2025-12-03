package TwoPoints;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class UnionTwoSortedArrays {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5 };
		int[] b = { 1, 2, 3, 6, 7 };

		Set<Integer> s = new LinkedHashSet<>();
		for (int x : a) {
			s.add(x);
		}
		for (int x : b) {
			s.add(x);

		}

		Integer[] arr = s.toArray(new Integer[0]);
		Arrays.sort(arr);
		for (int x : arr) {
			System.out.print(x + " ");
		}

	}
}
