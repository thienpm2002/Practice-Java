package SearchingAlgorithms;

import java.util.ArrayList;
import java.util.Arrays;

public class PairSumClosestTarget {
	// Dung 2 vong lap
	static ArrayList<Integer> solution1(int[] arr, int target) {
		int n = arr.length;
		int kc = Integer.MAX_VALUE;
		ArrayList<Integer> res = new ArrayList<>();
		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int currSum = arr[i] + arr[j];
				int currDiff = Math.abs(currSum - target);

				if (currDiff < kc) {
					kc = currDiff;
					res = new ArrayList<>(Arrays.asList(Math.min(arr[i], arr[j]), Math.max(arr[i], arr[j])));
				}

				if (currDiff == kc && (res.get(1) - res.get(0) < Math.abs(arr[i] - arr[j]))) {
					res = new ArrayList<>(Arrays.asList(Math.min(arr[i], arr[j]), Math.max(arr[i], arr[j])));
				}

			}
		}

		return res;
	}

	// Dung 2 con tro
	static ArrayList<Integer> solution2(int[] arr, int target) {
		int n = arr.length;
		Arrays.sort(arr);
		int left = 0, right = n - 1;
		ArrayList<Integer> res = new ArrayList<>();
		int minDiff = Integer.MAX_VALUE;
		while (left < right) {
			int currSum = arr[left] + arr[right];
			int currDiff = Math.abs(target - currSum);

			if (currDiff < minDiff) {
				minDiff = currDiff;
				res = new ArrayList<>(Arrays.asList(arr[left], arr[right]));
			}

			if (currSum == target) {
				return new ArrayList<>(Arrays.asList(arr[left], arr[right]));
			} else if (currSum < target) {
				left++;
			} else {
				right--;
			}
		}

		return res;
	}

	public static void main(String[] args) {
		int[] arr = { 5, 2, 7, 1, 4 };
		int k = 10;
		ArrayList<Integer> res = solution2(arr, k);

		for (Integer x : res) {
			System.out.print(x + " ");
		}
	}
}
