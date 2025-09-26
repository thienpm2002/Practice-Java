package Array;

import java.util.ArrayList;
import java.util.Collections;

public class KLargestSum {
	static int solution1(int[] arr, int k) {
		int n = arr.length;
		ArrayList<Integer> sums = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			int sum = 0;
			for (int j = i; j < n; j++) {
				sum += arr[j];
				sums.add(sum);
			}
		}
		Collections.sort(sums, Collections.reverseOrder());
		return sums.get(k - 1);
	}

	public static void main(String[] args) {
		int[] arr = { 20, -5, -1 };
		int k = 3;
		System.out.println(solution1(arr, k));
	}
}
