package SearchingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class LargestThreeDistinctElements {
	static List<Integer> solution1(int[] arr) {
		int n = arr.length;
		List<Integer> res = new ArrayList<>();
		Arrays.sort(arr);

		res.add(arr[n - 1]);

		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] != arr[n - 1]) {
				res.add(arr[i]);
				break;
			}
		}

		for (int i = n - 3; i >= 0; i--) {
			if (arr[i] != res.get(1)) {
				res.add(arr[i]);
				break;
			}

		}
		return res;
	}

	static List<Integer> solution2(int[] arr) {
		int n = arr.length;
		List<Integer> res = new ArrayList<>();
		int largest = Integer.MIN_VALUE, second = Integer.MIN_VALUE, three = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			if (arr[i] > largest) {
				three = second;
				second = largest;
				largest = arr[i];
			} else if (arr[i] < largest && arr[i] > second) {
				three = second;
				second = arr[i];
			} else if (arr[i] < second && arr[i] > three) {
				three = arr[i];
			}
		}
		if (largest != Integer.MIN_VALUE) {
			res.add(largest);
		}
		if (second != Integer.MIN_VALUE) {
			res.add(second);
		}
		if (three != Integer.MIN_VALUE) {
			res.add(three);
		}
		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 10, 10, 9 };
		List<Integer> res = solution2(arr);
		for (int x : res) {
			System.out.print(x + " ");
		}
	}
}
