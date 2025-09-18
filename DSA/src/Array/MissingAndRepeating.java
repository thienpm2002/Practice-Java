package Array;

import java.util.HashMap;

public class MissingAndRepeating {
	static void solution(int[] arr) {
		int n = arr.length;
		int sum = n * (n + 1) / 2;
		int repeat = 0;
		int sumArr = 0;
		HashMap<Integer, Integer> hs = new HashMap<>();
		for (int i = 0; i < n; i++) {
			if (hs.containsKey(arr[i])) {
				repeat = arr[i];
			} else {
				hs.put(arr[i], 1);
				sumArr += arr[i];
			}
		}
		int missing = sum - sumArr;
		System.out.println(repeat + " " + missing);
	}

	public static void main(String[] args) {
		int[] arr = { 1, 3, 1 };
		solution(arr);
	}
}
