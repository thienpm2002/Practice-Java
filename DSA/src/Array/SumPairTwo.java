package Array;

import java.util.ArrayList;
import java.util.List;

public class SumPairTwo {
	static List<List<Integer>> solution(int[] arr, int target) {
		int n = arr.length;
		List<List<Integer>> res = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (arr[i] + arr[j] == target && i != j) {
					List<Integer> items = new ArrayList<>();
					items.add(arr[i]);
					items.add(arr[j]);
					res.add(items);
				}
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 20, 10, 30 };
		int target = 50;
		List<List<Integer>> res = solution(arr, target);
		for (List<Integer> pair : res) {
			System.out.println(pair.get(0) + " " + pair.get(1));
		}
	}
}
