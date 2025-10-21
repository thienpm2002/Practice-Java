package SearchingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindKLargestElements {
	static List<Integer> solution1(int[] arr, int k) {
		int n = arr.length;
		List<Integer> res = new ArrayList<>();
		Arrays.sort(arr);
		res.add(arr[n - 1]);
		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] != arr[i + 1] && k - 1 > 0) {
				res.add(arr[i]);
				k--;
			}
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 23, 12, 9, 30, 2, 50 };
		int k = 3;
		List<Integer> res = solution1(arr, k);
		for (int x : res) {
			System.out.print(x + " ");
		}

	}
}
