package SearchingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class FindAllTriplestZeroSum {
	static ArrayList<ArrayList<Integer>> solution1(int[] arr) {
		int n = arr.length;
		ArrayList<ArrayList<Integer>> res = new ArrayList<>();

		for (int i = 0; i < n - 2; i++) {
			for (int j = i + 1; j < n - 1; j++) {
				for (int k = i + 2; k < n; k++) {
					if (arr[i] + arr[j] + arr[k] == 0) {
						ArrayList<Integer> item = new ArrayList<>(Arrays.asList(i, j, k));
						res.add(item);
					}
				}
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 0, -1, 2, -3, 1 };
		ArrayList<ArrayList<Integer>> res = solution1(arr);

		for (ArrayList<Integer> items : res) {
			for (Integer x : items) {
				System.out.print(x + " ");
			}
			System.out.println();
		}
	}
}
